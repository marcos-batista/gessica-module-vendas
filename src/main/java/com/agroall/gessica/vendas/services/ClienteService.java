package com.agroall.gessica.vendas.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.Cliente;

@org.springframework.stereotype.Service
public class ClienteService extends Service<Cliente> {
	
	private Collection<Cliente> clientes = new HashSet<>();
	
	@Override
	protected Repository getRepository() {
		return null;
	}
	
	@Override
	public Cliente factoryNewDataObject() {
		return new Cliente();
	}
	
	@Override
	public void insert(Cliente cliente) {
		int id = this.clientes.size(); id++;
		cliente.setId(Integer.toString(id));
		this.clientes.add(cliente);
	}
	
	@Override
	public Cliente findById(Object id) {
		return this.clientes.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}
	
	@Override
	public Collection<Cliente> listAll() {
		return this.clientes;
	}
	
	@Override
	public void update(Cliente clienteToUpdate) {
		Cliente foundedCliente = findById(clienteToUpdate.getId());
		foundedCliente.setRazaoSocial(clienteToUpdate.getRazaoSocial());
		foundedCliente.setNomeFantasia(clienteToUpdate.getNomeFantasia());
		foundedCliente.setCategoria(clienteToUpdate.getCategoria());
	}
	
	@Override
	public void delete(Cliente dataObject) {
		Collection<Cliente> clientes = this.clientes;
		for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if(cliente.getId().equals(dataObject.getId())) {
				iterator.remove(); return;
			}
		}
	}
	
}
