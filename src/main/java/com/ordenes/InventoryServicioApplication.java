package com.ordenes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ordenes.repository.InventoryRepository;
import com.ordenes.model.Inventory;





@SpringBootApplication
public class InventoryServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServicioApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory= new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(100);
			
			Inventory inventory1= new Inventory();
			inventory1.setSkuCode("iphone_13:red");
			inventory1.setQuantity(0);
			
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
	
}
	
