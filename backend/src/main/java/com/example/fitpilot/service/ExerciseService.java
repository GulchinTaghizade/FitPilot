package com.example.fitpilot.service;

import com.example.fitpilot.entity.Exercise;
import com.example.fitpilot.entity.User;

import java.util.List;
import java.util.Optional;

public interface ExerciseService {
    Exercise createExercise(Exercise exercise);
    List<Exercise> getExercises();
    Optional<Exercise> getExerciseById(Long id);
    Exercise updateExercise(Long id, Exercise updatedExercise);
    void deleteExercise(Long id);
}
