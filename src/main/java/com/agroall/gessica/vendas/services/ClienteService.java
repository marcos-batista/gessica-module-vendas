package com.agroall.gessica.vendas.services;

import com.agroall.gessica.vendas.dataobjects.Cliente;

@org.springframework.stereotype.Service
public class ClienteService extends VendasService<Cliente> {

	@Override
	public Cliente factoryNewDataObject() {
		return new Cliente();
	}
	
}
