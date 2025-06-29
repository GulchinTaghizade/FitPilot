package com.example.fitpilot.service.impl;

import com.example.fitpilot.entity.Workout;
import com.example.fitpilot.repository.UserRepository;
import com.example.fitpilot.repository.WorkoutRepository;
import com.example.fitpilot.service.WorkoutService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    private final WorkoutRepository workoutRepository ;

    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    @Override
    public Optional<Workout> getWorkoutById(Long id) {
        return workoutRepository.findById(id);
    }

    @Override
    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @Override
    public Workout updateWorkout(Long id,Workout updatedWorkout) {
        return  workoutRepository.findById(id)
                .map(existingWorkout -> {
                    existingWorkout.setWorkoutType(updatedWorkout.getWorkoutType());
                    existingWorkout.setWorkoutDate(updatedWorkout.getWorkoutDate());
                    return workoutRepository.save(existingWorkout);
                })
                .orElseThrow(() -> new RuntimeException("Workout not found"));
    }

    @Override
    public void deleteWorkout(Long id) {
        workoutRepository.deleteById(id);
    }
}
