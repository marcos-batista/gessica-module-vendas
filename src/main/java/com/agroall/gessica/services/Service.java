package com.agroall.gessica.services;

import java.util.Collection;

import com.agroall.gessica.repositories.Repository;

public abstract class Service<DATAOBJECT> {
	
	protected abstract Repository getRepository();
	
	public abstract DATAOBJECT factoryNewDataObject();
	
	public void insert(DATAOBJECT dataObject) {
		getRepository().insert(dataObject);
	}
	
	public void update(DATAOBJECT dataObject) {
		getRepository().update(dataObject);
	}
	
	public void delete(DATAOBJECT dataObject) {
		getRepository().delete(dataObject);
	}
	
	public DATAOBJECT findById(Object id) {
		return getRepository().findById(id);
	}
	
	public Collection<DATAOBJECT> listAll() {
		return getRepository().listAll();
	}
	
	
}
