package com.bwacomputacao.cursomcrefazendo.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.cursomcrefazendo.domain.Pedido;
import com.bwacomputacao.cursomcrefazendo.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo; 
	
	public Pedido Find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
				
		
	}

	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
