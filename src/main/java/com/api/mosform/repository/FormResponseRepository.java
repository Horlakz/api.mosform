package com.api.mosform.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.mosform.entity.FormResponse;

public interface FormResponseRepository extends JpaRepository<FormResponse, UUID> {

}
