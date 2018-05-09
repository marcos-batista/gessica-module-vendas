package com.agroall.gessica.vendas.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class OrdemVenda extends Venda implements Persistent<String> {
	
	private String id;
	private Collection<ItemOrdemVenda> itens;
	
	public OrdemVenda() {
		this.itens = factoryItensOrdemVendCollection();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Collection<ItemOrdemVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrdemVenda> itens) {
		this.itens = itens;
	}
	
	public void addItem(ItemOrdemVenda item) {
		if(this.itens == null) { this.itens = factoryItensOrdemVendCollection(); }
		this.itens.add(item);
	}
	
	protected Collection<ItemOrdemVenda> factoryItensOrdemVendCollection() {
		return new HashSet<ItemOrdemVenda>();
	}
	
	//=================================================== métodos auxiliares ==============================================//
	public ItemOrdemVenda factoryItem() {
		return new ItemOrdemVenda();
	}
	
}
