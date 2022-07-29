package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuestionType;
    private String nameQuestionType;
    @OneToMany(mappedBy = "questionType")
    @JsonBackReference("questionType")
    Set<QuestionContent> questionContents;

    public QuestionType(Integer idQuestionType, String nameQuestionType, Set<QuestionContent> questionContents) {
        this.idQuestionType = idQuestionType;
        this.nameQuestionType = nameQuestionType;
        this.questionContents = questionContents;
    }

    public QuestionType() {
    }

    public Integer getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(Integer idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getNameQuestionType() {
        return nameQuestionType;
    }

    public void setNameQuestionType(String nameQuestionType) {
        this.nameQuestionType = nameQuestionType;
    }

    public Set<QuestionContent> getQuestionContents() {
        return questionContents;
    }

    public void setQuestionContents(Set<QuestionContent> questionContents) {
        this.questionContents = questionContents;
    }
}
