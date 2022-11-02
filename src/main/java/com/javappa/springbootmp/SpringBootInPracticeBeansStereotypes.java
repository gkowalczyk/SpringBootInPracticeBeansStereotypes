package com.javappa.springbootmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

import com.javappa.springbootmp.component.ItemComponent;
import com.javappa.springbootmp.controller.ItemController;
import com.javappa.springbootmp.repository.ItemRepository;
import com.javappa.springbootmp.service.ItemService;

@SpringBootApplication
public class SpringBootInPracticeBeansStereotypes {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootInPracticeBeansStereotypes.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootInPracticeBeansStereotypes.class, args);
	}
	@EventListener
	@Order
	public void onApplicationEvent(ApplicationReadyEvent event) {

		ItemComponent itemComponent = event.getApplicationContext().getBean(ItemComponent.class);
		LOG.info("Application contains: {}", itemComponent.getName());
		
		ItemController itemController = event.getApplicationContext().getBean(ItemController.class);
		ItemService itemService = event.getApplicationContext().getBean(ItemService.class);
		ItemRepository itemRepository = event.getApplicationContext().getBean(ItemRepository.class);		
		
		LOG.info("Application contains: {}", itemController.getName());
		LOG.info("Application contains: {}", itemService.getName());
		LOG.info("Application contains: {}", itemRepository.getName());
	}
}
