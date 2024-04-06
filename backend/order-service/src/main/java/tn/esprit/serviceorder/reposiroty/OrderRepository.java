package tn.esprit.serviceorder.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.serviceorder.entity.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {
}
