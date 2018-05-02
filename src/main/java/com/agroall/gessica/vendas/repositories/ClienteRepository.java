package com.agroall.gessica.vendas.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.vendas.dataobjects.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Integer>, Repository {
	
	List<Cliente> findById(String id);
	
}
