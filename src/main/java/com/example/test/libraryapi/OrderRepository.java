package com.example.test.libraryapi;

import com.example.test.libraryapi.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findAll();
}
