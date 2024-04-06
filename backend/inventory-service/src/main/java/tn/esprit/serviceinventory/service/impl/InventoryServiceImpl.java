package tn.esprit.serviceinventory.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.serviceinventory.repository.InventoryRepository;
import tn.esprit.serviceinventory.service.InventoryService;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @Override
    public boolean isInStock(String skuCode) {
        log.info("Checking Inventory");
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}

