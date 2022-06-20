package com.codegym.repository;

import com.codegym.model.Application;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ApplicationRepository implements IApplicationRepository {
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

    public List<Application> findAll() {
        String query = "SELECT p FROM Application AS p";
        TypedQuery<Application> typedQuery = entityManager.createQuery(query, Application.class);
        return typedQuery.getResultList();
    }

    public void creatSong(Application application) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(application);
        entityTransaction.commit();
    }

    public Application findById(int id) {
        Application application = entityManager.find(Application.class, id);
        return application;
    }

    public void editSong(Application application) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(application);
        entityTransaction.commit();
    }

    public void delete(Application application) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(application);
        entityTransaction.commit();
    }


}
