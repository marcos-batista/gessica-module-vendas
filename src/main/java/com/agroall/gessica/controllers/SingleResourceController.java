package com.agroall.gessica.controllers;

public abstract class SingleResourceController<DATAOBJECT> extends ResourceController<DATAOBJECT> {
	
	protected DATAOBJECT factoryNewDataObject() {
		return getService().factoryNewDataObject();
	}
	
	protected void insert(DATAOBJECT dataObject) {
		getService().insert(dataObject);
	}
	
	protected void update(DATAOBJECT dataObject) {
		getService().update(dataObject);
	}
	
	protected void delete(DATAOBJECT dataObject) {
		getService().delete(dataObject);
	}
	
	protected void findById(Object id) {
		getService().findById(id);
	}
	
	//--------------------- metodos que serao expostos ---------------------//
	
	public DATAOBJECT doGet() {
		return getService().factoryNewDataObject();
	}
	
	public DATAOBJECT doGet(String id) {
		return getService().findById(id);
	}
	
	public DATAOBJECT doPost(DATAOBJECT dataObject) {
		getService().insert(dataObject);
		return dataObject;
	}
	
	public DATAOBJECT doPut(DATAOBJECT dataObject) {
		getService().update(dataObject);
		return dataObject;
	}
	
	public DATAOBJECT doDelete(DATAOBJECT dataObject) {
		getService().delete(dataObject);
		return getService().factoryNewDataObject();
	}
	
}
