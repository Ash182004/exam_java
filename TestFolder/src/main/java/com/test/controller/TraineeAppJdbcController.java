package com.test.controller;

import com.test.dao.*;
import com.test.dto.Trainee;

public class TraineeAppJdbcController {
	
	public static void main(String[] args) {
		
		TraineeDao traineeDao = new TraineeDaoJdbcImpl();

		
		Trainee trainee2 = new Trainee("abc", "java", 10);
		try {
			trainee2 = traineeDao.addTrainee(trainee2);
		} catch (DaoException e) {
			e.printStackTrace();
		}

		
		System.out.println("Trainee id = 1");
		Trainee t1;
		try {
			t1 = traineeDao.findTraineeById(1);
			System.out.println(t1);
		} catch (DaoException e) {
			e.printStackTrace();
		}		

		
		System.out.println("Trainee id = 10");
		try {
			Trainee t2 = traineeDao.findTraineeById(10);
			System.out.println(t2);
		} catch (DaoException e) {
			e.printStackTrace();
		}

		
		
		try {
			Trainee t4 = traineeDao.findTraineeById(trainee2.getTrainee_id());
			System.out.println(t4);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
	}

}