package com.agroall.gessica.vendas.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.vendas.dataobjects.Cliente;

public class ClienteRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <Cliente> Cliente insert_(Cliente cliente) {
		mongo.insert(cliente);
		return cliente;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <Cliente> Cliente update_(Cliente cliente) {
		mongo.save(cliente);
		return cliente;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <Cliente> void delete_(Cliente cliente) {
		mongo.remove(cliente);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <Cliente> Cliente findById_(Object id) {
		com.agroall.gessica.vendas.dataobjects.Cliente result = mongo.findById(id, com.agroall.gessica.vendas.dataobjects.Cliente.class);
		return (Cliente) result;
	}

	@Override
	@SuppressWarnings({ "unchecked", "hiding" })
	public <Cliente> Collection<Cliente> listAll_() {
		List<com.agroall.gessica.vendas.dataobjects.Cliente> result = mongo.findAll(com.agroall.gessica.vendas.dataobjects.Cliente.class);
		return (Collection<Cliente>) result;
	}

}
