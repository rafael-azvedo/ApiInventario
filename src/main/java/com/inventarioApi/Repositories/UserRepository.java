package com.inventarioApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventarioApi.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
