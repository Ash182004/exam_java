package com.test.service;

import com.test.dao.DaoException;
import com.test.dto.Trainee;

public interface TraineeService {

    Trainee addTrainee(Trainee trainee) throws DaoException;
    
    Trainee findTraineeById(int traineeId) throws DaoException;
}