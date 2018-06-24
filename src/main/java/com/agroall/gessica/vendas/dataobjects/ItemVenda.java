package com.agroall.gessica.vendas.dataobjects;

public class ItemVenda extends com.agroall.gessica.dataobjects.ItemVenda {
	
	private Double margemLucroItem;
	private Double descontoItem;
	private Double precoCalculado;
	
	private ProdutoComercial produtoComercial;
	
	public ItemVenda() {
		super();
		this.margemLucroItem = 0d;
		this.descontoItem = 0d;
	}
	
	@Override
	public void setPrecoItem(Double precoItem) {}
	
	public Double getMargemLucroItem() {
		return margemLucroItem;
	}
	
	public void setMargemLucroItem(Double margemLucroItem) {
		this.margemLucroItem = margemLucroItem;
		calculatePreco();
	}
	
	public Double getDescontoItem() {
		return descontoItem;
	}
	
	public void setDescontoItem(Double descontoItem) {
		this.descontoItem = descontoItem;
		calculatePreco();
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	@Override
	protected void calculatePreco() {
		if(super.getPrecoCalculado() == null) { this.precoCalculado = null; return; }
		if(this.descontoItem == null) { this.precoCalculado = null; return; }
		if(this.margemLucroItem == null) { this.precoCalculado = null; return; }
		this.precoCalculado = ((super.getPrecoCalculado() - this.descontoItem) + this.margemLucroItem);
	}
	
	public ProdutoComercial getProdutoComercial() {
		return produtoComercial;
	}
	
	public void setProdutoComercial(ProdutoComercial produtoComercial) {
		this.produtoComercial = produtoComercial;
		super.setPrecoItem(this.produtoComercial.getPrecoCalculado());
	}
	
}