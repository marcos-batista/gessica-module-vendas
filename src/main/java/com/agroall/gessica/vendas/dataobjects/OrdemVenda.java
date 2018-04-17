package com.agroall.gessica.vendas.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.Venda;

public class OrdemVenda extends Venda {
	
	private Collection<ItemOrdemVenda> itens;
	
	public Collection<ItemOrdemVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrdemVenda> itens) {
		this.itens = itens;
	}
	
}
