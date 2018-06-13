package com.agroall.gessica.vendas.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class ProdutoComercialRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <ProdutoComercial> ProdutoComercial insert_(ProdutoComercial cliente) {
		mongo.insert(cliente);
		return cliente;
	}
	
	@Override
	public <ProdutoComercial> ProdutoComercial update_(ProdutoComercial cliente) {
		mongo.save(cliente);
		return cliente;
	}
	
	@Override
	public <ProdutoComercial> void delete_(ProdutoComercial cliente) {
		mongo.remove(cliente);
	}

	@Override
	@SuppressWarnings({"unchecked" })
	public <ProdutoComercial> ProdutoComercial findById_(Object id) {
		com.agroall.gessica.vendas.dataobjects.ProdutoComercial result = mongo.findById(id, com.agroall.gessica.vendas.dataobjects.ProdutoComercial.class);
		return (ProdutoComercial) result;
	}

	@Override
	@SuppressWarnings({"unchecked"})
	public <ProdutoComercial> Collection<ProdutoComercial> listAll_() {
		List<com.agroall.gessica.vendas.dataobjects.ProdutoComercial> result = mongo.findAll(com.agroall.gessica.vendas.dataobjects.ProdutoComercial.class);
		return (Collection<ProdutoComercial>) result;
	}

}
