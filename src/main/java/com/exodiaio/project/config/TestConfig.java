package com.exodiaio.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exodiaio.project.entities.User;
import com.exodiaio.project.repositories.UserRepository;

	// CLASS DE TESTE DE CONFIGURAÇÃO

@Configuration // MARCAÇÃO PARA SINALIZAR QUE ESTE CLASS É UMA CLASS DE CONFIGURAÇÃO
@Profile("test") // PASSANDO O PROFILE. PROFILE FICA NO APPLICATION-TEST-PROPERTIES
public class TestConfig implements CommandLineRunner{
							// COMANDLINERRUNNER É UMA INTERFACE PRA DAR START E PERSISTE OS DADOS AO BANCO
	@Autowired // FAZENDO INJEÇÃO
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
	// SALVA OS USUARIOS ACIMA NO BANCO DE DADOS, PASSA O USERREPOSITORY SALVANDO TODOOS EM UM ARRAY LISTA
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
