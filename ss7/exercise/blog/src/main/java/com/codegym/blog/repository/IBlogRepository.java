package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from Blog", nativeQuery = true)
    Page<Blog> showList(Pageable pageable);

    @Query(value = "select * from Blog", nativeQuery = true)
    List<Blog> showList();

//    @Modifying
//    @Query(value = "insert into blog(name_blog,content,category_id_category) values(:name,:content,:idCategory) ", nativeQuery = true)
//    void create(@Param("name") String name, @Param("content") String content, @Param("idCategory") Integer idCategory);

    @Query(value = "select * from blog where id_blog = :id ", nativeQuery = true)
    Blog viewsBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set name_blog = :name ,content = :content,category_id_category=:category  where id_blog = :id ", nativeQuery = true)
    void edit(@Param("name") String name,
              @Param("content") String content,
              @Param("category") Integer category,
              @Param("id") Integer id);

    @Modifying
    @Query(value = "delete from blog where id_blog = :id ", nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "select * from blog where name_blog like :name", nativeQuery = true)
    List<Blog> blogByName(@Param("name") String name);
}
