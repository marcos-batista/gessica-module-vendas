package com.agroall.gessica.vendas.dataobjects;

public class Cliente extends com.agroall.gessica.dataobjects.Cliente {
	
	private String id;
	
	public Cliente() {}
	
	public Cliente(String razaoSocial, String nomeFantasia) {
		setRazaoSocial(razaoSocial);
		setNomeFantasia(nomeFantasia);
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
