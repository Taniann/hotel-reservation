package ua.tania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.tania.dto.OrderDto;
import ua.tania.entity.Order;
import ua.tania.repository.OrderRepository;
import ua.tania.service.OrderService;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public void save(OrderDto orderDto) {
        Order order = new Order();
        orderRepository.save(order);
    }
}
