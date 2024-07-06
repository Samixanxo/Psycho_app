package dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.TaskDTO;
import model.Task;

@Repository
public class TasKDaoImpl implements TaskDao {

	 @Autowired
	    private TaskJpaSpring taskJpaSpring;

	    @Override
	    public List<TaskDTO> retrieveTasks(Integer idUser) {
	        return taskJpaSpring.findByUserId(idUser);
	    }

		@Override
		public boolean addTask(Task task) {
			if (task != null) {
				taskJpaSpring.save(task);
				return true;
			} else {
				return false;
			}
		}
}
