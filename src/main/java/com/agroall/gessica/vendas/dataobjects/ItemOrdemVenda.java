package com.agroall.gessica.vendas.dataobjects;

import com.agroall.gessica.dataobjects.ItemVenda;

public class ItemOrdemVenda extends ItemVenda {
	
	private ProdutoComercial produtoComercial;
	
	public ProdutoComercial getProdutoComercial() {
		return produtoComercial;
	}
	
	public void setProdutoComercial(ProdutoComercial produtoComercial) {
		this.produtoComercial = produtoComercial;
	}
	
}
