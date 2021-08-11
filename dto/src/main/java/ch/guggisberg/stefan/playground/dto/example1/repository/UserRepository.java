package ch.guggisberg.stefan.playground.dto.example1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.guggisberg.stefan.playground.dto.example1.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	

}
