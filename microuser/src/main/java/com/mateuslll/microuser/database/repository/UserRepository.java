package com.mateuslll.microuser.database.repository;

import com.mateuslll.microuser.database.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
