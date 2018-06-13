package com.agroall.gessica.vendas.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.ItemOrdemVenda;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;
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
	public OrdemVenda insert(OrdemVenda ordemVenda) {
		validateOrdemVendaBeforeSave(ordemVenda);
		return super.insert(ordemVenda);
	}
	
	@Override
	public OrdemVenda update(OrdemVenda ordemVenda) {
		validateOrdemVendaBeforeSave(ordemVenda);
		return super.update(ordemVenda);
	}
	
	protected void validateOrdemVendaBeforeSave(OrdemVenda ordemVenda) {
		if(ordemVenda == null) throw new RuntimeException("A ordem de venda não foi informada");
		if(ordemVenda.getItens() == null || ordemVenda.getItens().isEmpty()) throw new RuntimeException("Os itens da ordem de venda não foram informados");
		Collection<ItemOrdemVenda> itensOrdemVenda = ordemVenda.getItens();
		for (ItemOrdemVenda itemOrdemVenda : itensOrdemVenda) {
			if(itemOrdemVenda.getProdutoComercial() == null) throw new RuntimeException("Há pelo menos um item da ordem de venda cujo produto não foi informado");
		}
	}
	
}
