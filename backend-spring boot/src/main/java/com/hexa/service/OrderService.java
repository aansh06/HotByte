package com.hexa.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.hexa.Exception.CartException;
import com.hexa.Exception.OrderException;
import com.hexa.Exception.RestaurantException;
import com.hexa.Exception.UserException;
import com.hexa.model.Order;
import com.hexa.model.PaymentResponse;
import com.hexa.model.User;
import com.hexa.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
