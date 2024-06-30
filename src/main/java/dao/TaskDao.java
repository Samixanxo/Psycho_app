package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Task;

@Service
public interface TaskDao {

	List<Task>retrieveTasks(Integer idUser);
}
