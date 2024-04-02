package tn.esprit.serviceinventory.service;

import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.serviceinventory.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    boolean isInStock(String skuCode) ;

}
