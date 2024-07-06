package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import dto.ResponseTaskDTO;
import dto.TaskDTO;
import model.Task;

@Service
public interface TaskDao {

	
	List<ResponseTaskDTO>retrieveTasks(Integer idUser);

	boolean addTask(Task task);
}
