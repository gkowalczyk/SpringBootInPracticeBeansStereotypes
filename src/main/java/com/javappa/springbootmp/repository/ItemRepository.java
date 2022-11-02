package com.javappa.springbootmp.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import com.javappa.springbootmp.component.ItemComponent;

@Repository
public class ItemRepository {

	private static final Logger LOG = LoggerFactory.getLogger(ItemComponent.class);
	
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOG.info("ItemRepository {} is ready", this.getClass().getName());
	}
	
	public String getName() {
		return "REPOSITORY";
	}	
}
