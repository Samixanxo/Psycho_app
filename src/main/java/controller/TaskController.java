package controller;

import java.util.HashMap;

import dto.TaskDTO;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Task;
import service.TaskService;
import service.UserService;
import user.User;

@RestController
@RequestMapping("/api")
public class TaskController {

	
	@Autowired
    private TaskService taskService;
	
	@Autowired
	private UserService userService;

    @GetMapping(value = "tasks/{idUser}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> retrieveTasks(@PathVariable("idUser") Integer idUser) {
        List<TaskDTO> tasks = taskService.retrieveTasks(idUser);
        Map<String, Object> response = new HashMap<>();
        response.put("tasks", tasks);
        return ResponseEntity.ok(response);
    }
    
    @PostMapping(value = "tasks/new")
    public ResponseEntity<?> create (@RequestBody TaskDTO task)
    {
     Map<String, Object> response = new HashMap<>();
     User user = userService.getUserFromId(task.getUser().getId());
    	if (user == null) {
    		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    	}
    	
    	Task newTask = new Task();
    	newTask.setName(task.getName());
    	newTask.setDescription(task.getDescription());
    	newTask.setCreationDate(task.getCreationDate());
    	newTask.setDueDate(task.getDueDate());
    	newTask.setState(false);
    	newTask.setUser(user);

         taskService.addTask(newTask);
         response.put("message", "Task has been successfully created");
         response.put("Task", newTask);
         
         return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
	
	
	
	
}
