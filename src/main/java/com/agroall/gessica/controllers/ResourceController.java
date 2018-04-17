package com.agroall.gessica.controllers;

import com.agroall.gessica.services.Service;

public abstract class ResourceController<DATAOBJECT> {
	
	protected abstract Service<DATAOBJECT> getService();
	
}
