package com.agroall.gessica.vendas.services;

import com.agroall.gessica.services.GessicaService;

public abstract class VendasService<DATAOBJECT> extends GessicaService<DATAOBJECT> {
	
	protected final void disableOperation(DATAOBJECT dataObject) {
		if(dataObject == null) {
			dataObject = factoryNewDataObject();
		}
		throw new RuntimeException(
			"This operation is not enabled for objects of type " +
			dataObject.getClass().getSimpleName()
		);
	}
	
}
