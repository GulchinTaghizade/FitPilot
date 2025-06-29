package com.example.fitpilot.repository;

import com.example.fitpilot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}