package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
