package com.agroall.gessica.vendas.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "orcamentosvenda")
public class OrcamentoVenda extends Venda implements Persistent<String> {
	
	@Id private String id;
	private Double precoCalculado;
	
	private Collection<ItemOrcamentoVenda> itens;
	
	public OrcamentoVenda() {
		super();
		this.itens = factoryCollectionItemOrcamentoVenda();
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
	
	public Collection<ItemOrcamentoVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoVenda> itens) {
		this.itens = itens;
	}
	
	public void addItemOrcamentoVenda(ItemOrcamentoVenda itemOrcamentoVenda) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrcamentoVenda(); }
		this.itens.add(itemOrcamentoVenda);
		calculatePreco();
	}
	
	protected Collection<ItemOrcamentoVenda> factoryCollectionItemOrcamentoVenda() {
		return new HashSet<ItemOrcamentoVenda>();
	}
	
	protected void calculatePreco() {
		if(getItens().isEmpty()) this.precoCalculado = 0d;
		Double precoCalculado = 0d;
		for (ItemOrcamentoVenda itemOrcamentoVenda : getItens()) {
			precoCalculado += itemOrcamentoVenda.getPrecoCalculado();
		}
		this.precoCalculado = precoCalculado;
	}
	
}
