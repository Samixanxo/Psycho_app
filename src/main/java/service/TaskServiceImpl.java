package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TaskDao;
import dto.ResponseTaskDTO;
import dto.TaskDTO;
import model.Task;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskDao dao;



	@Override
    public List<ResponseTaskDTO> retrieveTasks(Integer idUser) {
        return dao.retrieveTasks(idUser);
    }



	@Override
	public boolean addTask(Task task) {
		return dao.addTask(task);
		
	}



	

}
