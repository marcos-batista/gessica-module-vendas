package com.agroall.gessica.vendas.dataobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "vendas")
public class OrdemVenda extends Venda implements Persistent<String> {
	
	@Id private String id;
	private Double precoCalculado;
	
	private List<ItemOrdemVenda> itens;
	
	public OrdemVenda() {
		super();
		this.itens = factoryCollectionItemOrdemVenda();
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public com.agroall.gessica.vendas.dataobjects.Cliente getCliente() {
		return (com.agroall.gessica.vendas.dataobjects.Cliente) super.getCliente();
	}
	
	public void setCliente(com.agroall.gessica.vendas.dataobjects.Cliente cliente) {
		super.setCliente(cliente);
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public Collection<ItemOrdemVenda> getItens() {
		return itens;
	}
	
	public void setItens(List<ItemOrdemVenda> itens) {
		this.itens = itens;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public void addItemOrdemVenda(ItemOrdemVenda itemOrdemVenda) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrdemVenda(); }
		this.itens.add(itemOrdemVenda);
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	protected List<ItemOrdemVenda> factoryCollectionItemOrdemVenda() {
		return new ArrayList<ItemOrdemVenda>();
	}
	
	protected Double resolvePrecoCalculado() {
		Double precoCalculado;
		if(this.itens == null) { precoCalculado = null; return precoCalculado; }
		if(this.itens.isEmpty()) { precoCalculado = 0d; return precoCalculado; }
		precoCalculado = 0d;
		for (ItemOrdemVenda itemOrdemVenda : this.itens) {
			Double precoItem = itemOrdemVenda.getPrecoCalculado();
			if(precoItem == null) { continue; }
			precoCalculado += precoItem;
		}
		return precoCalculado;
	}
	
}
