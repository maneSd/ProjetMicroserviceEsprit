package tn.esprit.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.serviceproduct.dto.ProductRequest;
import tn.esprit.serviceproduct.dto.ProductResponse;
import tn.esprit.serviceproduct.entity.Product;
import tn.esprit.serviceproduct.repository.ProductRepository;

import java.util.List;
@RequiredArgsConstructor
@Slf4j
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
  @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
