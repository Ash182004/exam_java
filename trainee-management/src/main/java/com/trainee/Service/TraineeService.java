package com.trainee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee.Dao.traineeDao;
import com.trainee.Dto.Trainee;

@Service
public class TraineeService {

    private final traineeDao traineeDAO;

    @Autowired
    public TraineeService(traineeDao traineeDAO) {
        this.traineeDAO = traineeDAO;
    }

    public void addTrainee(Trainee trainee) {
        traineeDAO.addTrainee(trainee);
    }

    public Trainee getTraineeById(int id) {
        return traineeDAO.findById(id);
    }
}
