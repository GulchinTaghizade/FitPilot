package com.example.fitpilot.controller;


import com.example.fitpilot.entity.Exercise;
import com.example.fitpilot.entity.FitnessGoal;
import com.example.fitpilot.service.FitnessGoalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fitnessGoals")
public class FitnessGoalController {
    private final FitnessGoalService fitnessGoalService;
    public FitnessGoalController(FitnessGoalService fitnessGoalService) {
        this.fitnessGoalService = fitnessGoalService;
    }

    @PostMapping
    public ResponseEntity<FitnessGoal> createFitnessGoal(@RequestBody FitnessGoal fitnessGoal) {
        return ResponseEntity.ok(fitnessGoalService.createFitnessGoal(fitnessGoal));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FitnessGoal> getFitnessGoalById(Long id) {
       return fitnessGoalService.getFitnessGoalById(id)
                .map(ResponseEntity:: ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<FitnessGoal>>getAllFitnessGoals() {
        return ResponseEntity.ok(fitnessGoalService.getAllFitnessGoals());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FitnessGoal> updateFitnessGoal(Long id, @RequestBody FitnessGoal fitnessGoal) {
        return ResponseEntity.ok(fitnessGoalService.updateFitnessGoal(id, fitnessGoal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FitnessGoal> deleteFitnessGoalById(Long id) {
        fitnessGoalService.deleteFitnessGoalById(id);
        return ResponseEntity.ok().build();
    }
}
