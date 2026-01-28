package com.test.controller;

import com.test.dao.DaoException;
import com.test.dao.TraineeDao;
import com.test.dao.TraineeDaoHibImpl;
import com.test.dto.Trainee;

public class TraineeAppHibController {
	public static void main(String[] args) {

		TraineeDao traineeDao = new TraineeDaoHibImpl();
		
		Trainee trainee = new Trainee("yui", "html", 7);
		try {
			trainee = traineeDao.addTrainee(trainee);
		} catch (DaoException e) {
			e.printStackTrace();
		}

		
		
		System.out.println("Trainee with id = 5");
		Trainee t1;
		try {
			t1 = traineeDao.findTraineeById(5);
			System.out.println(t1);
		} catch (DaoException e) {
			e.printStackTrace();
		}		

		
		System.out.println("Trainee with id = 10");
		Trainee t2;
		try {
			t2 = traineeDao.findTraineeById(10);
			System.out.println(t2);
		} catch (DaoException e) {
			e.printStackTrace();
		}

		Trainee t3 = new Trainee("abc", "jss", 31);
		
		
		Trainee t4;
		try {
			t4 = traineeDao.findTraineeById(t3.getTrainee_id());
			System.out.println(t4);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}
}