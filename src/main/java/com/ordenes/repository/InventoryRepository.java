package com.ordenes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ordenes.model.Inventory;
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Optional<Inventory> findBySkuCode();
	
}
