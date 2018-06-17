package com.agroall.gessica.vendas.dataobjects;

import com.agroall.gessica.dataobjects.ItemVenda;

public class ItemOrdemVenda extends ItemVenda {
	
	private ProdutoComercial produtoComercial;
	
	public ItemOrdemVenda() {
		super();
	}
	
	public ProdutoComercial getProdutoComercial() {
		return produtoComercial;
	}
	
	public void setProdutoComercial(ProdutoComercial produtoComercial) {
		this.produtoComercial = produtoComercial;
		setPrecoItem(produtoComercial);
	}
	
	private void setPrecoItem(ProdutoComercial produtoComercial) {
		Double precoCalculadoProdutoComercial = produtoComercial == null ? 0d : produtoComercial.getPrecoCalculado();
		super.setPrecoItem(precoCalculadoProdutoComercial);
	}
	
	@Override
	public void setPrecoItem(Double precoItem) {}
	
}
