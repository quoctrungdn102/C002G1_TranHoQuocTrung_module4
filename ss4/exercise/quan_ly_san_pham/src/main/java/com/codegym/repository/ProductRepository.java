package com.codegym.repository;

import com.codegym.model.Product;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public void creatProduct(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(product);
        entityTransaction.commit();
    }

    public List<Product> findAll() {
        String query = "SELECT p FROM Product AS p";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
        return typedQuery.getResultList();
    }

    public Product findById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    public void editProduct(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(product);
        entityTransaction.commit();
    }

    public void delete(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(product);
        entityTransaction.commit();
    }

    public List<Product> search(String name) {
        String query = "select p from Product p where p.nameProduct like :name";
        TypedQuery<Product> productTypedQuery = entityManager.createQuery(query, Product.class);
        productTypedQuery.setParameter("name", "%" + name + "%");
        return productTypedQuery.getResultList();
    }

}
