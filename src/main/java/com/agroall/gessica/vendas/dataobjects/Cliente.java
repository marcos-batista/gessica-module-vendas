package com.agroall.gessica.vendas.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "clientes")
public class Cliente extends com.agroall.gessica.dataobjects.Cliente implements Persistent<String> {
	
	@Id private String id;
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = (String) id;
	}
	
}
