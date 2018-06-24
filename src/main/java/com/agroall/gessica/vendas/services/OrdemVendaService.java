package com.agroall.gessica.vendas.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.ItemOrdemVenda;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;
import com.agroall.gessica.vendas.dataobjects.ProdutoComercial;
import com.agroall.gessica.vendas.repositories.OrdemVendaRepository;

@Service
public class OrdemVendaService extends ServiceImpl<OrdemVenda> {
	
	@Autowired private OrdemVendaRepository repository;
	
	@Override
	public OrdemVenda factoryNewDataObject() {
		return new OrdemVenda();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
	@Override
	protected void validateBeforeInsertOrUpdate(OrdemVenda ordemVenda) {
		super.validateBeforeInsertOrUpdate(ordemVenda);
		Collection<ItemOrdemVenda> itensOrdemVenda = ordemVenda.getItens();
		if(itensOrdemVenda == null) return;
		for (ItemOrdemVenda itemOrdemVenda : itensOrdemVenda) {
			ProdutoComercial produtoComercial = itemOrdemVenda.getProdutoComercial();
			if(produtoComercial == null) throw new RuntimeException("Existem itens da venda cujo produto não foi informado.");
		}
	}
	
}
