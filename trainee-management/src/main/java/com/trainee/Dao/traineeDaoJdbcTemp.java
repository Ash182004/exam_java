package com.trainee.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trainee.Dto.Trainee;
import com.trainee.Exception.TraineeDataAccessException;
import com.trainee.Exception.TraineeNotFoundException;
import com.trainee.Dao.traineeDao;

@Repository
@ConditionalOnProperty(name = "trainee.dao.type", havingValue = "jdbc")
public class traineeDaoJdbcTemp implements traineeDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public traineeDaoJdbcTemp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional
	public void addTrainee(Trainee trainee) {
        try {
            jdbcTemplate.update(
                "INSERT INTO trainee (trainee_id, trainee_name, branch, percentage) VALUES (?,?,?,?)",
                trainee.getTrainee_id(),
                trainee.getTrainee_name(),
                trainee.getBranch(),
                trainee.getPercentage()
            );
        }  catch (Exception e) {
            throw new TraineeDataAccessException("unable to add trainee" + trainee, e);
        }
    }

	private void delay() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Override
    public Trainee findById(int traineeId) {
        try {
            return jdbcTemplate.queryForObject(
                "SELECT trainee_id, trainee_name, branch, percentage FROM trainee WHERE trainee_id=?",
                (rs, rowNum) -> new Trainee(
                    rs.getInt("trainee_id"),
                    rs.getString("trainee_name"),
                    rs.getString("branch"),
                    rs.getDouble("percentage")
                ),
                traineeId
            );
        }  catch (org.springframework.dao.EmptyResultDataAccessException e) {
            
            throw new TraineeNotFoundException("Trainee with id " + traineeId + " does not exist");
        } catch (Exception e) {
            throw new TraineeDataAccessException("Error finding trainee with id " + traineeId, e);
        }
    }

}
