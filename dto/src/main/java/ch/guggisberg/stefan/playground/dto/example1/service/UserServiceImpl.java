package ch.guggisberg.stefan.playground.dto.example1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.guggisberg.stefan.playground.dto.example1.dto.UserDTO;
import ch.guggisberg.stefan.playground.dto.example1.model.User;
import ch.guggisberg.stefan.playground.dto.example1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository; 
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UserDTO> getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(UserDTO user) {
		return userRepository.save(new User(user.getId(),user.getName(), user.getVorname()));
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
