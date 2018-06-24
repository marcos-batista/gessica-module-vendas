package com.agroall.gessica.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.OrcamentoVenda;
import com.agroall.gessica.vendas.services.OrcamentoVendaService;

@RestController
@CrossOrigin
@RequestMapping("/orcamento")
public class OrcamentoVendaDataResource extends DataObjectResourceControllerImpl<OrcamentoVenda> {
	
	@Autowired private OrcamentoVendaService service;
	
	@Override
	protected Service<OrcamentoVenda> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public OrcamentoVenda doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrcamentoVenda doPost(@RequestBody OrcamentoVenda orcamentoVenda) {
		orcamentoVenda.setId(null);
		return super.doPost(orcamentoVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public OrcamentoVenda doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public OrcamentoVenda doPut(@PathVariable(value = "id") String id, OrcamentoVenda orcamentoVenda) {
		orcamentoVenda.setId(id);
		return super.doPut(id, orcamentoVenda);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OrcamentoVenda doDelete(OrcamentoVenda orcamentoVenda) {
		return super.doDelete(orcamentoVenda);
	}
	
}
