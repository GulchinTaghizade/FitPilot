package com.example.fitpilot.repository;

import com.example.fitpilot.entity.FitnessGoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessGoalRepository extends JpaRepository<FitnessGoal, Long> {
}