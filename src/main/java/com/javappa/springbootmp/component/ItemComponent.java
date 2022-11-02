package com.javappa.springbootmp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ItemComponent {

	private static final Logger LOG = LoggerFactory.getLogger(ItemComponent.class);
	
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOG.info("ItemComponent {} is ready", this.getClass().getName());
	}
	
	public String getName() {
		return "COMPONENT";
	}
}
