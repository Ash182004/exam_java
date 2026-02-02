package com.trainee.Dao;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trainee.Dao.traineeDao;
import com.trainee.Dto.Trainee;
import com.trainee.Exception.TraineeDataAccessException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@ConditionalOnProperty(name = "trainee.dao.type", havingValue = "jpa")
public class TraineeDaoJpaTemp implements traineeDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void addTrainee(Trainee trainee) {
        try {
            em.persist(trainee);
        } catch (Exception e) {
            throw new TraineeDataAccessException("Error saving trainee using JPA", e);
        }
    }

    @Override
    public Trainee findById(int traineeId) {
        try {
            return em.find(Trainee.class, traineeId);
        } catch (Exception e) {
            throw new TraineeDataAccessException("Error finding trainee with id " + traineeId, e);
        }
    }
}