package ch.guggisberg.stefan.playground.dto.example1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.guggisberg.stefan.playground.dto.example1.dto.UserDTO;
import ch.guggisberg.stefan.playground.dto.example1.model.User;
import ch.guggisberg.stefan.playground.dto.example1.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping
	public List<UserDTO> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public User createUser(@RequestBody UserDTO user) {
		return userService.create(user);
		
	}

}
