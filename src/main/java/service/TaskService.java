package service;

import java.util.List;

import dto.TaskDTO;
import model.Task;

public interface TaskService {

	List<TaskDTO>retrieveTasks(Integer idUser);

	

}
