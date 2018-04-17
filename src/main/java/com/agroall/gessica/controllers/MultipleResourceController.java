package com.agroall.gessica.controllers;

import java.util.Collection;
import java.util.HashSet;

public abstract class MultipleResourceController<DATAOBJECT> extends ResourceController<DATAOBJECT> {
	
	protected abstract Collection<DATAOBJECT> getDataObjectCollection();
	
	protected Collection<DATAOBJECT> factoryDataObjectCollection() {
		return new HashSet<DATAOBJECT>();
	}
	
	protected void addDataObject(DATAOBJECT dataObject) {
		addDataObject(getDataObjectCollection(), dataObject);
	}
	
	protected void addDataObject(Collection<DATAOBJECT> collectionDataObject, DATAOBJECT dataObject) {
		collectionDataObject.add(dataObject);
	}
	
	//--------------------- metodos que serao expostos ---------------------//
	
	public DATAOBJECT doGet() {
		return getService().factoryNewDataObject();
	}
	
	@SuppressWarnings("restriction")
	public DATAOBJECT doPost(String id) {
		throw new sun.reflect.generics.reflectiveObjects.NotImplementedException();
	}
	
	@SuppressWarnings("restriction")
	public DATAOBJECT doPut(String id) {
		throw new sun.reflect.generics.reflectiveObjects.NotImplementedException();
	}
	
	@SuppressWarnings("restriction")
	public DATAOBJECT doDelete(String id) {
		throw new sun.reflect.generics.reflectiveObjects.NotImplementedException();
	}
	
}
