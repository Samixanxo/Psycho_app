package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TaskDao;
import model.Task;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskDao dao;



	@Override
	public List<Task> retrieveTasks(Integer idUser) {
		
		return dao.retrieveTasks(idUser);
	}



	

}
