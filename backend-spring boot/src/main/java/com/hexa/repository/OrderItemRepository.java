package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
