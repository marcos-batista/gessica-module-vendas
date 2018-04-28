package com.agroall.gessica.vendas.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class Cliente extends com.agroall.gessica.dataobjects.Cliente implements Persistent {
	
	private Integer id;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = (Integer) id;
	}
	
}
