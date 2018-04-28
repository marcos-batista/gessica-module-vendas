package com.agroall.gessica.vendas.services;

import com.agroall.gessica.vendas.dataobjects.Cliente;

@org.springframework.stereotype.Service
public class ClienteService extends VendasService<Cliente> {

	@Override
	public Cliente factoryNewDataObject() {
		return new Cliente();
	}
	
//	@Override
//	public void update(Cliente newDataObject) {
//		Cliente oldDataObject = findById(newDataObject.getId());
//		oldDataObject.setRazaoSocial(newDataObject.getRazaoSocial());
//		oldDataObject.setNomeFantasia(newDataObject.getNomeFantasia());
//		oldDataObject.setCategoria(newDataObject.getCategoria());
//	}
	
}
