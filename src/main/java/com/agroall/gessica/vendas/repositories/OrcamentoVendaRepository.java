package com.agroall.gessica.vendas.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.vendas.dataobjects.OrcamentoVenda;

public interface OrcamentoVendaRepository extends MongoRepository<OrcamentoVenda, String>, Repository {
	
}
