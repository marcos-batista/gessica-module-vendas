package com.agroall.gessica.vendas.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class OrcamentoVendaRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <OrcamentoVenda> OrcamentoVenda insert_(OrcamentoVenda cliente) {
		mongo.insert(cliente);
		return cliente;
	}
	
	@Override
	public <OrcamentoVenda> OrcamentoVenda update_(OrcamentoVenda cliente) {
		mongo.save(cliente);
		return cliente;
	}
	
	@Override
	public <OrcamentoVenda> void delete_(OrcamentoVenda cliente) {
		mongo.remove(cliente);
	}

	@Override
	@SuppressWarnings({"unchecked"})
	public <OrcamentoVenda> OrcamentoVenda findById_(Object id) {
		com.agroall.gessica.vendas.dataobjects.OrcamentoVenda result = mongo.findById(id, com.agroall.gessica.vendas.dataobjects.OrcamentoVenda.class);
		return (OrcamentoVenda) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrcamentoVenda> Collection<OrcamentoVenda> listAll_() {
		List<com.agroall.gessica.vendas.dataobjects.OrcamentoVenda> result = mongo.findAll(com.agroall.gessica.vendas.dataobjects.OrcamentoVenda.class);
		return (Collection<OrcamentoVenda>) result;
	}

}
