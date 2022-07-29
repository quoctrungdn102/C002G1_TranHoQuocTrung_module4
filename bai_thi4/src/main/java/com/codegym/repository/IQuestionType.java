package com.codegym.repository;

import com.codegym.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IQuestionType extends JpaRepository<QuestionType,Integer> {

}
