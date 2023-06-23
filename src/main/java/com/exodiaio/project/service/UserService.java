package com.exodiaio.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exodiaio.project.entities.User;
import com.exodiaio.project.repositories.UserRepository;

// DECLARANDO QUE A CLASS É UMA CLASS DE SERVIÇOS
@Service
public class UserService {

	@Autowired // INJETANDO O REPOSITORIO
	private UserRepository repository;

			// PUXANDO O FINDALL DO RESPOSITORY, QUE IMPLEMANTA O JPAREPOSITORY
	public List<User> findAll(){
		return repository.findAll();
	// REPOSITORIO QUE PUXA UMA LISTA DE OBJETOS	
	}
	
	public User findById(Long id) {
		// TERMO IMPLEMENTADO DESDO JAVA 8
		Optional<User> optionalRepository = repository.findById(id);
		return optionalRepository.get();
	// RETORNANDO UM OBJETO PELO ID
		
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
