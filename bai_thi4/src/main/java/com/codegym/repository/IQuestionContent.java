package com.codegym.repository;

import com.codegym.model.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IQuestionContent extends JpaRepository<QuestionContent,Integer> {
}
