package com.trainee.Dao;



import com.trainee.Dto.Trainee;



public interface traineeDao{
	public void addTrainee(Trainee trainee);
	public Trainee findById(int traineeId);
}