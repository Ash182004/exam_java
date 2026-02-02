package com.trainee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trainee.Dto.Trainee;
import com.trainee.Service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {

    private final TraineeService traineeService;

    @Autowired
    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping
    public String addTrainee(@RequestBody Trainee trainee) {
        traineeService.addTrainee(trainee);
        return "Trainee added successfully";
    }

    @GetMapping("/{id}")
    public Trainee getTrainee(@PathVariable int id) {
        return traineeService.getTraineeById(id);
    }
}
