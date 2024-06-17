package com.api.mosform.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.mosform.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
