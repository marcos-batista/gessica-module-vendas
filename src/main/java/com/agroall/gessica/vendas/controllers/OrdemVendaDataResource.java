package com.agroall.gessica.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;
import com.agroall.gessica.vendas.services.OrdemVendaService;

@RestController
@RequestMapping("/venda")
@CrossOrigin
public class OrdemVendaDataResource extends DataObjectResourceControllerImpl<OrdemVenda> {
	
	@Autowired private OrdemVendaService service;
	
	@Override
	protected Service<OrdemVenda> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public OrdemVenda doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrdemVenda doPost(@RequestBody OrdemVenda ordemVenda) {
		ordemVenda.setId(null);
		return super.doPost(ordemVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public OrdemVenda doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public OrdemVenda doPut(@PathVariable(value = "id") String id, OrdemVenda ordemVenda) {
		ordemVenda.setId(id);
		return super.doPut(id, ordemVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OrdemVenda doDelete(OrdemVenda ordemVenda) {
		return super.doDelete(ordemVenda);
	}
	
}
