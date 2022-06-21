package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from Blog", nativeQuery = true)
    List<Blog> showList();

    @Modifying
    @Query(value = "insert into Blog(nameBlog,content) values(:name,:content) ", nativeQuery = true)
    void create(@Param("name") String name, @Param("content") String content);

    @Query(value = "select * from Blog where idBlog = :id ", nativeQuery = true)
    Blog viewsBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = "update Blog set nameBlog = :name ,content = :content  where idBlog = :id ", nativeQuery = true)
    void edit(@Param("name") String name,
              @Param("content") String content,
              @Param("id") Integer id);

    @Modifying
    @Query(value = "delete from Blog where idBlog = :id ", nativeQuery = true)
    void delete(@Param("id") Integer id);
}
