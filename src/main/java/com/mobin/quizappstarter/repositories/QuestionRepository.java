package com.mobin.quizappstarter.repositories;

import com.mobin.quizappstarter.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}