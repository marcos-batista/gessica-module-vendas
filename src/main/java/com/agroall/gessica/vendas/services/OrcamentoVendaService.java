package com.agroall.gessica.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.OrcamentoVenda;
import com.agroall.gessica.vendas.repositories.OrcamentoVendaRepository;

@Service
public class OrcamentoVendaService extends ServiceImpl<OrcamentoVenda> {
	
	@Autowired private OrcamentoVendaRepository repository;
	
	@Override
	public OrcamentoVenda factoryNewDataObject() {
		return new OrcamentoVenda();
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
