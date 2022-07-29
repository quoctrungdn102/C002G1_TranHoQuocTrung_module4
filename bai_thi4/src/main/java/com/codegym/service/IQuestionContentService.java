package com.codegym.service;

import com.codegym.model.QuestionType;
import com.codegym.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionContentService {
    public Page<QuestionContent> listPageStudent(Pageable pageable);

    public void createStudent(QuestionContent student);

    public List<QuestionType> list();

    QuestionContent findById(Integer id);

}
