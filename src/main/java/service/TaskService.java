package service;

import java.util.List;

import dto.ResponseTaskDTO;
import dto.TaskDTO;
import model.Task;

public interface TaskService {

	List<ResponseTaskDTO>retrieveTasks(Integer idUser);

	boolean addTask(Task task);

	

}
