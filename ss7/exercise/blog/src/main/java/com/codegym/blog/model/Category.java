package com.codegym.blog.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;
    private String nameCategory;
    @OneToMany(mappedBy = "category")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Blog> blogs;

    public Category() {
    }

    public Category(String nameCategory, Set<Blog> blogs) {
        this.nameCategory = nameCategory;
        this.blogs = blogs;
    }

    public Category(Integer idCategory, String nameCategory, Set<Blog> blogs) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.blogs = blogs;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Set<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }
}
