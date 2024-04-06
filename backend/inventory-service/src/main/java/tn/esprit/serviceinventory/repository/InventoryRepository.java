package tn.esprit.serviceinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.serviceinventory.entity.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}