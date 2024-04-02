package tn.esprit.service.impl;

import tn.esprit.serviceproduct.dto.ProductRequest;
import tn.esprit.serviceproduct.dto.ProductResponse;
import tn.esprit.serviceproduct.entity.Product;

import java.util.List;

public interface ProductService {
     void createProduct(ProductRequest productRequest);
     List<ProductResponse> getAllProducts();
}
