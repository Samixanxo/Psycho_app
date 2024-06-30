package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Task;

@Repository
public class TasKDaoImpl implements TaskDao {

	@Autowired
	TaskJpaSpring task;
	
	@Override
	public List<Task> retrieveTasks(Integer idUser)
	{
		return task.findByUserId(idUser);
	}
}
