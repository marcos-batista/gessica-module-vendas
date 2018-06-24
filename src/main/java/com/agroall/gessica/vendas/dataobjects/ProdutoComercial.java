package com.agroall.gessica.vendas.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "produtos")
public class ProdutoComercial extends com.agroall.gessica.dataobjects.ProdutoComercial implements Persistent<String> {
	
	@Id private String id;
	private Double margemLucroUnitario;
	private Double descontoUnitario;
	private Double precoCalculado;
	
	public ProdutoComercial() {
		super();
		this.margemLucroUnitario = 0d;
		this.descontoUnitario = 0d;
		resolvePrecoCalculado();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = (String) id;
	}
	
	@Override
	public void setPrecoUnitario(Double precoUnitario) {
		super.setPrecoUnitario(precoUnitario);
		resolvePrecoCalculado();
	}
	
	public Double getMargemLucroUnitario() {
		return margemLucroUnitario;
	}
	
	public void setMargemLucroUnitario(Double margemLucroUnitario) {
		this.margemLucroUnitario = margemLucroUnitario;
		resolvePrecoCalculado();
	}
	
	public Double getDescontoUnitario() {
		return descontoUnitario;
	}
	
	public void setDescontoUnitario(Double descontoUnitario) {
		this.descontoUnitario = descontoUnitario;
		resolvePrecoCalculado();
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	protected Double resolvePrecoCalculado() {
		Double precoUnitario = getPrecoUnitario();
		if(precoUnitario == null) { this.precoCalculado = null; return null;}
		if(this.descontoUnitario == null) { this.precoCalculado = null; return null; }
		if(this.margemLucroUnitario == null) { this.precoCalculado = null; return null; }
		this.precoCalculado = ((precoUnitario - this.descontoUnitario) + this.margemLucroUnitario);
		return this.precoCalculado;
	}
	
}
