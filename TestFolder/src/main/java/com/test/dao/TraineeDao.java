package com.test.dao;

import com.test.dto.Trainee;
import com.test.dao.DaoException;

public interface TraineeDao {
	 Trainee addTrainee(Trainee trainee) throws DaoException;
	    
	    Trainee findTraineeById(int traineeId) throws DaoException;
}
