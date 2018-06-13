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
import com.agroall.gessica.vendas.dataobjects.ProdutoComercial;
import com.agroall.gessica.vendas.services.ProdutoComercialService;

@RestController
@RequestMapping("/produto")
@CrossOrigin
public class ProdutoComercialResource extends DataObjectResourceControllerImpl<ProdutoComercial> {
	
	@Autowired private ProdutoComercialService service;
	
	@Override
	protected Service<ProdutoComercial> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ProdutoComercial doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doPost(@RequestBody ProdutoComercial cliente) {
		cliente.setId(null);
		return super.doPost(cliente);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProdutoComercial doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doPut(@PathVariable(value = "id") String id, @RequestBody ProdutoComercial cliente) {
		cliente.setId(id);
		return super.doPut(id, cliente);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doDelete(ProdutoComercial cliente) {
		return super.doDelete(cliente);
	}
	
}
