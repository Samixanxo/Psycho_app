package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.TaskDTO;
import service.UserService;
import user.User;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping(value ="user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> getUserFromId(@PathVariable("id") Integer id) {
		User user = userService.getUserFromId(id);
        Map<String, Object> response = new HashMap<>();
        response.put("User", user);
        return ResponseEntity.ok(response);
    }
	
}
