package tn.esprit.serviceinventory.service;

import tn.esprit.serviceinventory.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isInStock(List<String> skuCode) ;

}
