package com.agroall.gessica.vendas.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.ResourceController;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.Cliente;
import com.agroall.gessica.vendas.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesResource extends ResourceController<Cliente> {
	
	@Autowired private ClienteService service;
	
	@Override
	protected Service<Cliente> getService() {
		return this.service;	
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Cliente> listClientes() {
		return this.service.listAll();
	}
	
}
