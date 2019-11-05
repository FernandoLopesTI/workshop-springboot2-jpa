package br.com.flsoftware.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flsoftware.course.entities.User;
import br.com.flsoftware.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> optional = repository.findById(id);
		return optional.get();
	}
	
}
