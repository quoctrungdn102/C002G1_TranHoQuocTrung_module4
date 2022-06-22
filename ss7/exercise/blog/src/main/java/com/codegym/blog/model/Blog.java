package com.codegym.blog.model;

import javax.persistence.*;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String nameBlog;
    private String content;
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog(Integer idBlog, String nameBlog, String content, Category category) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;
        this.content = content;
        this.category = category;
    }

    public Blog() {
    }

    public Blog(Integer idBlog, String nameBlog, String content) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;
        this.content = content;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
