package com.agroall.gessica.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.Cliente;
import com.agroall.gessica.vendas.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource extends GessicaDataObjectResourceController<Cliente> {
	
	@Autowired private ClienteService service;
	
	@Override
	protected Service<Cliente> getService() {
		return this.service;	
	}
	
	@Override
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public Cliente doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Cliente doPost(@RequestBody Cliente cliente) {
		return super.doPost(cliente);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Cliente doGet(@PathVariable(value = "id") Object id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Cliente doPut(@RequestBody Cliente cliente) {
		return super.doPut(cliente);
	}
	
	@Override
	@RequestMapping(method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public Cliente doDelete(@RequestBody Cliente cliente) {
		return super.doDelete(cliente);
	}
	
}
