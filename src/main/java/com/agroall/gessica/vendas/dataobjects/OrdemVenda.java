package com.agroall.gessica.vendas.dataobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "ordensvenda")
public class OrdemVenda extends Venda implements Persistent<String> {
	
	@Id private String id;
	private Double precoCalculado;
	
	private List<ItemOrdemVenda> itens;
	
	public OrdemVenda() {
		super();
		this.itens = factoryCollectionItemOrdemVenda();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	public Collection<ItemOrdemVenda> getItens() {
		return itens;
	}
	
	public void setItens(List<ItemOrdemVenda> itens) {
		this.itens = itens;
	}
	
	public void addItemOrdemVenda(ItemOrdemVenda itemOrdemVenda) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrdemVenda(); }
		this.itens.add(itemOrdemVenda);
		calculatePreco();
	}
	
	protected List<ItemOrdemVenda> factoryCollectionItemOrdemVenda() {
		return new ArrayList<ItemOrdemVenda>();
	}
	
	protected void calculatePreco() {
		if(getItens().isEmpty()) this.precoCalculado = 0d;
		Double precoCalculado = 0d;
		for (ItemOrdemVenda itemOrdemVenda : getItens()) {
			precoCalculado += itemOrdemVenda.getPrecoCalculado();
		}
		this.precoCalculado = precoCalculado;
	}
	
}
