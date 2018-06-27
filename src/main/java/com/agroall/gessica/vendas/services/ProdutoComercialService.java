package com.agroall.gessica.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;
import com.agroall.gessica.vendas.dataobjects.ProdutoComercial;
import com.agroall.gessica.vendas.repositories.ProdutoComercialRepository;

@Service
public class ProdutoComercialService extends ServiceImpl<ProdutoComercial> {
	
	@Autowired private ProdutoComercialRepository repository;
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
	@Override
	public ProdutoComercial factoryNewDataObject() {
		return new ProdutoComercial();
	}
	
	@Override
	protected void validateBeforeInsertOrUpdate(ProdutoComercial produtoComercial) {
		super.validateBeforeInsertOrUpdate(produtoComercial);
		if(produtoComercial.getDescricao() == null || produtoComercial.getDescricao().trim().isEmpty()) {
			throw new RuntimeException("Descrição do produto não foi informada!");
		}
		//TODO: implementar validação que checa se o código informado é de um produto insumo válido.
		if(produtoComercial.getCodigo() == null || produtoComercial.getCodigo().trim().isEmpty()) {
			throw new RuntimeException("Código do produto não foi informado!");
		}
	}
	
}
