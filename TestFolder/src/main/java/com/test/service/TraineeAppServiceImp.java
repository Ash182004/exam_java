package com.test.service;
import com.test.dao.DaoException;
import com.test.dao.TraineeDao;

import com.test.dto.Trainee;

public class TraineeAppServiceImp implements TraineeService {

    private TraineeDao traineeDao; 

    public TraineeAppServiceImp(TraineeDao dao) {
        this.traineeDao = dao; 
    }

    @Override
    public Trainee addTrainee(Trainee trainee) throws DaoException {
        
        if(trainee.getPercentage() < 0 || trainee.getPercentage() > 100) {
            throw new IllegalArgumentException("Invalid percentage");
        }
        return traineeDao.addTrainee(trainee); 
    }

    @Override
    public Trainee findTraineeById(int traineeId) throws DaoException {
        return traineeDao.findTraineeById(traineeId); 
    }
}
