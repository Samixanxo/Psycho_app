package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Task;
import service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {

	
	@Autowired
	TaskService taskService;
	
	@GetMapping(value = "tasks/{idUser}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> retrieveTasks(@PathVariable("idUser") Integer idUser) {
	    List<Task> tasks = taskService.retrieveTasks(idUser);
	    Map<String, Object> response = new HashMap<>();
	    response.put("tasks", tasks);
	    return ResponseEntity.ok(response);
	}
	
	
	
	
}
