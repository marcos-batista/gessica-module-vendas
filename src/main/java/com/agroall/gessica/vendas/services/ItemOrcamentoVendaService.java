package com.agroall.gessica.vendas.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.ItemOrcamentoVenda;

@Service
public class ItemOrcamentoVendaService extends ServiceImpl<ItemOrcamentoVenda> {
	
	@Override
	public ItemOrcamentoVenda factoryNewDataObject() {
		return new ItemOrcamentoVenda();
	}
	
	@Override
	public ItemOrcamentoVenda insert(ItemOrcamentoVenda dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public ItemOrcamentoVenda update(ItemOrcamentoVenda dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public void delete(ItemOrcamentoVenda dataObject) {
		disableOperation(dataObject);
	}
	
	@Override
	public ItemOrcamentoVenda findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ItemOrcamentoVenda> listAll() {
		disableOperation(null);
		return null;
	}
	
}
