package com.api.mosform.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mosform.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, UUID> {

}
