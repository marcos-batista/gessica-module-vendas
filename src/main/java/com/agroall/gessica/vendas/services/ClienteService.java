package com.agroall.gessica.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.vendas.dataobjects.Cliente;
import com.agroall.gessica.vendas.repositories.ClienteRepository;

@org.springframework.stereotype.Service
public class ClienteService extends VendasService<Cliente> {
	
	@Autowired private ClienteRepository repository;
	
	@Override
	public Cliente factoryNewDataObject() {
		return new Cliente();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
}
