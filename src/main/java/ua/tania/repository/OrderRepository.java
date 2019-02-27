package ua.tania.repository;

import org.springframework.data.repository.CrudRepository;
import ua.tania.entity.Order;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
