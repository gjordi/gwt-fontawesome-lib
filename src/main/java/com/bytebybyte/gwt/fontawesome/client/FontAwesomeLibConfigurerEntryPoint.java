package com.bytebybyte.gwt.fontawesome.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;

public class FontAwesomeLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(FontAwesomeLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		logger.log(Level.INFO, "Injecting font awesome dependencies.");
	}

}
