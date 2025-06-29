package com.example.fitpilot.service;

import com.example.fitpilot.entity.FitnessGoal;

import java.util.List;
import java.util.Optional;

public interface FitnessGoalService {
    FitnessGoal createFitnessGoal(FitnessGoal goal);
    List<FitnessGoal> getAllFitnessGoals();
    Optional<FitnessGoal> getFitnessGoalById(Long id);
    FitnessGoal updateFitnessGoal(Long id, FitnessGoal updatedFitnessGoal);
    void deleteFitnessGoalById(Long id);
}
