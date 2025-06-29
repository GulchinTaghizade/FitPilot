package com.example.fitpilot.service.impl;

import com.example.fitpilot.entity.FitnessGoal;
import com.example.fitpilot.repository.ExerciseRepository;
import com.example.fitpilot.repository.FitnessGoalRepository;
import com.example.fitpilot.service.FitnessGoalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FitnessGoalServiceImpl implements FitnessGoalService {
    private final FitnessGoalRepository fitnessGoalRepository;

    public  FitnessGoalServiceImpl(FitnessGoalRepository fitnessGoalRepository) {
        this.fitnessGoalRepository = fitnessGoalRepository;
    }
    @Override
    public FitnessGoal createFitnessGoal(FitnessGoal goal) {
        return fitnessGoalRepository.save(goal);
    }

    @Override
    public List<FitnessGoal> getAllFitnessGoals() {
        return fitnessGoalRepository.findAll();
    }

    @Override
    public Optional<FitnessGoal> getFitnessGoalById(Long id) {
        return fitnessGoalRepository.findById(id);
    }

    @Override
    public FitnessGoal updateFitnessGoal(Long id, FitnessGoal updatedFitnessGoal) {
        return fitnessGoalRepository.findById(id)
                .map(existingFitnessGoal->{
                    existingFitnessGoal.setGoalType(updatedFitnessGoal.getGoalType());
                    existingFitnessGoal.setTargetDate(updatedFitnessGoal.getTargetDate());
                    return fitnessGoalRepository.save(existingFitnessGoal);
                })
                .orElseThrow(() -> new RuntimeException("FitnessGoal not found"));
    }

    @Override
    public void deleteFitnessGoalById(Long id) {
        fitnessGoalRepository.deleteById(id);
    }
}
