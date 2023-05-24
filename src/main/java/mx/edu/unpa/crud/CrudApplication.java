package mx.edu.unpa.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.edu.unpa.crud.repository.AspirantesRepository;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	@Autowired
	private AspirantesRepository repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	
	}

}
