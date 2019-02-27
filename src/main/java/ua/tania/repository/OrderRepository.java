package ua.tania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tania.entity.Order;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
