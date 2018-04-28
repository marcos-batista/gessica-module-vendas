package com.agroall.gessica.vendas.services;

import com.agroall.gessica.vendas.dataobjects.OrdemVenda;

public class OrdemVendaService extends VendasService<OrdemVenda> {

	@Override
	public OrdemVenda factoryNewDataObject() {
		return new OrdemVenda();
	}

}
