package com.example.fitpilot.service.impl;

import com.example.fitpilot.entity.Exercise;
import com.example.fitpilot.repository.ExerciseRepository;
import com.example.fitpilot.service.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public Optional<Exercise> getExerciseById(Long id) {
        return exerciseRepository.findById(id);
    }

    @Override
    public Exercise updateExercise(Long id, Exercise updatedExercise) {
        return exerciseRepository.findById(id)
                .map(existingExercise->{
                    existingExercise.setName(updatedExercise.getName());
                    existingExercise.setReps(updatedExercise.getReps());
                    existingExercise.setSets(updatedExercise.getSets());
                    return exerciseRepository.save(existingExercise);
                })
                .orElseThrow(() -> new RuntimeException("Exercise not found"));
    }

    @Override
    public void deleteExercise(Long id) {
        exerciseRepository.deleteById(id);
    }
}
