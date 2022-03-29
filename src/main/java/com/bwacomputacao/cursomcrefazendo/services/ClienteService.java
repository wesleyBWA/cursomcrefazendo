package com.bwacomputacao.cursomcrefazendo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.cursomcrefazendo.domain.Cliente;
import com.bwacomputacao.cursomcrefazendo.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo; 
	
	public Cliente Find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
				
		
	}

	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
