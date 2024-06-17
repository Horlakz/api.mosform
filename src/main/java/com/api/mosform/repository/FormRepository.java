package com.api.mosform.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mosform.entity.Form;

public interface FormRepository extends JpaRepository<Form, UUID> {

}
