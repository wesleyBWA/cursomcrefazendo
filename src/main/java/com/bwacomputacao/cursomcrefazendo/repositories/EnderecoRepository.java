package com.bwacomputacao.cursomcrefazendo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bwacomputacao.cursomcrefazendo.domain.Endereco;



@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	

}


