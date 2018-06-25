package com.agroall.gessica.vendas.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;
import com.agroall.gessica.vendas.services.OrdemVendaService;

@RestController
@CrossOrigin
@RequestMapping("/vendas")
public class OrdemVendaCollectionResource extends DataCollectionResourceControllerImpl<OrdemVenda> {
	
	@Autowired private OrdemVendaService service;
	
	@Override
	protected Service<OrdemVenda> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OrdemVenda> doList() {
		return super.doList();
	}
	
}
