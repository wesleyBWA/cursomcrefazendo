package com.bwacomputacao.cursomcrefazendo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bwacomputacao.cursomcrefazendo.domain.ItemPedido;



@Repository
public interface ItempedidoRepository extends JpaRepository<ItemPedido, Integer> {
	

}


