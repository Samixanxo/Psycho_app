package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import dto.TaskDTO;
import model.Task;

@Service
public interface TaskDao {

	
	List<TaskDTO>retrieveTasks(Integer idUser);

	boolean addTask(Task task);
}
