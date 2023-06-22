package com.exodiaio.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exodiaio.project.entities.User;

		// CLASS SENDO CONTROLADA PELO SPRING BOOT


@RestController
@RequestMapping(value="/users") // MAPEANDO ESSA CLASS PARA IMPRESSÃO NO WEBSITE, PARAMETRO /USERS
public class UserResource {
	
	// METODO QUE SERA IMPRESSO NO PARAMETRO /USERS
	@GetMapping // MAPEANDO METODO, FAZENDO GET
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Antnoio", "antonio@gmail.com", "85985417392", "123456");
		return ResponseEntity.ok().body(user);
	}
	
	// GETMAPPING(/USERS/GET) FAZ OQUE OUTRO METODO SEJA IMPRESSO DENTRO DO PARAMETRO /USERS
}
