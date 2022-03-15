package com.bwacomputacao.cursomcrefazendo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bwacomputacao.cursomcrefazendo.domain.Categoria;
import com.bwacomputacao.cursomcrefazendo.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcrefazendoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcrefazendoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
         Categoria cat1 = new Categoria(null, "Informatica");
         Categoria cat2 = new Categoria(null, "Escritorio");
         
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
