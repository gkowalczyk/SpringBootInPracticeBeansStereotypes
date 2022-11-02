package com.javappa.springbootmp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {

	private static final Logger LOG = LoggerFactory.getLogger(ItemController.class);
	
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOG.info("ItemController {} is ready", this.getClass().getName());
	}
	
	public String getName() {
		return "CONTROLLER";
	}	
}
