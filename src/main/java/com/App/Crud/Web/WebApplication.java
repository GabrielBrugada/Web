package com.App.Crud.Web;

import com.App.Crud.Web.entidad.Estudiante;
import com.App.Crud.Web.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	@Autowired
    private EstudianteRepository repository;
	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1 = new Estudiante("gabi","bru","gabi@gmail.com");
		repository.save(estudiante1);
		Estudiante estudiante2= new Estudiante("ger","va","gerva@gmail.com");
		repository.save(estudiante2);*/
	}
}
