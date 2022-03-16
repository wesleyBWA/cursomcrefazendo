package com.bwacomputacao.cursomcrefazendo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.cursomcrefazendo.domain.Categoria;
import com.bwacomputacao.cursomcrefazendo.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria Find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
				
		
	}

	public Categoria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
