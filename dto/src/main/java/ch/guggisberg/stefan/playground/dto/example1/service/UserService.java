package ch.guggisberg.stefan.playground.dto.example1.service;

import java.util.List;
import java.util.Optional;

import ch.guggisberg.stefan.playground.dto.example1.dto.UserDTO;
import ch.guggisberg.stefan.playground.dto.example1.model.User;

public interface UserService {
	
	List<UserDTO> getAllUsers();
	
	Optional<UserDTO> getUserById(Long id);
	
	Optional<User> getUserId(Long id);
	
	User create(UserDTO user);
	
	User update(User user);
	
	void delete(User user);
	

}
