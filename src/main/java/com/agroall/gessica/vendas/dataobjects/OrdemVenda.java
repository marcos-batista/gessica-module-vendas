package com.agroall.gessica.vendas.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class OrdemVenda extends Venda implements Persistent {
	
	private Integer id;
	private Collection<ItemOrdemVenda> itens;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = (Integer) id;
	}
	
	public Collection<ItemOrdemVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrdemVenda> itens) {
		this.itens = itens;
	}
	
}
