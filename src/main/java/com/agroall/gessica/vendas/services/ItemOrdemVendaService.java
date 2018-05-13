package com.agroall.gessica.vendas.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.vendas.dataobjects.ItemOrdemVenda;

@Service
public class ItemOrdemVendaService extends VendasService<ItemOrdemVenda> {
	
	@Override
	public ItemOrdemVenda factoryNewDataObject() {
		return new ItemOrdemVenda();
	}
	
	@Override
	public ItemOrdemVenda insert(ItemOrdemVenda dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public ItemOrdemVenda update(ItemOrdemVenda dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public void delete(ItemOrdemVenda dataObject) {
		disableOperation(dataObject);
	}
	
	@Override
	public ItemOrdemVenda findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ItemOrdemVenda> listAll() {
		disableOperation(null);
		return null;
	}
	
}
