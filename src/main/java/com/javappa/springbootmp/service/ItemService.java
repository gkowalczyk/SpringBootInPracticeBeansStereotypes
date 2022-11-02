package com.javappa.springbootmp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.javappa.springbootmp.component.ItemComponent;

@Service
public class ItemService {

	private static final Logger LOG = LoggerFactory.getLogger(ItemComponent.class);
	
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOG.info("ItemService {} is ready", this.getClass().getName());
	}
	
	public String getName() {
		return "SERVICE";
	}	
}
