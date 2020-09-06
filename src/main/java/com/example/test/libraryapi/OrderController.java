package com.example.test.libraryapi;

import com.example.test.libraryapi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/order")
    Order getOrderById(@RequestParam(value = "id") Long id){
        return orderRepository.findById(id).get();
    }
}
