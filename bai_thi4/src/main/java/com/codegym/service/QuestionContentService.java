package com.codegym.service;

import com.codegym.model.QuestionType;
import com.codegym.model.QuestionContent;
import com.codegym.repository.IQuestionType;
import com.codegym.repository.IQuestionContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionContentService implements IQuestionContentService {
    @Autowired
    private IQuestionContent iStudentRepository;
    @Autowired
    private IQuestionType iClass;

    @Override
    public Page<QuestionContent> listPageStudent(Pageable pageable) {
        return iStudentRepository.findAll(pageable);
    }

    @Override
    public void createStudent(QuestionContent student) {
        iStudentRepository.save(student);
    }
    public List<QuestionType> list(){
        return iClass.findAll();
    }

    @Override
    public QuestionContent findById(Integer id) {
        return iStudentRepository.findById(id).get();
    }

}
