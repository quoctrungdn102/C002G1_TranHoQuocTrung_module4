package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class QuestionContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuestionContent;
    @NotBlank(message = "tên không dược để trống  ")
    private String title;
    private String content;
    private String answer;
    @ManyToOne(targetEntity = QuestionType.class)
    private QuestionType questionType;
    private String date_create;
    private Boolean status;

    public QuestionContent() {
    }

    public QuestionContent(Integer idQuestionContent, @NotBlank(message = "tên không dược để trống  ") String title, String content, String answer, QuestionType questionType, String date_create, Boolean status) {
        this.idQuestionContent = idQuestionContent;
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.questionType = questionType;
        this.date_create = date_create;
        this.status = status;
    }

    public Integer getIdQuestionContent() {
        return idQuestionContent;
    }

    public void setIdQuestionContent(Integer idQuestionContent) {
        this.idQuestionContent = idQuestionContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}