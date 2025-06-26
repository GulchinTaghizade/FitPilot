package com.example.fitpilot.service;

import com.example.fitpilot.entity.Workout;

import java.util.List;
import java.util.Optional;

public interface WorkoutService {
    Workout createWorkout(Workout workout);
    Optional<Workout> getWorkoutById(Long id);
    List<Workout> getAllWorkouts();
    Workout updateWorkout(Long id,Workout updatedWorkout);
    void deleteWorkout(Long id);

}
