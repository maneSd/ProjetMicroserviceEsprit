package tn.esprit.serviceproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.serviceproduct.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
