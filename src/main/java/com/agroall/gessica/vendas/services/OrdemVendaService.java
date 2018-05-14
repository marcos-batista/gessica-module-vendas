package com.agroall.gessica.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;
import com.agroall.gessica.vendas.repositories.OrdemVendaRepository;

@Service
public class OrdemVendaService extends ServiceImpl<OrdemVenda> {
	
	@Autowired private OrdemVendaRepository repository;
	
	@Override
	public OrdemVenda factoryNewDataObject() {
		return new OrdemVenda();
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
