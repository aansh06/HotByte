package com.hexa.service;

import java.util.List;

import com.hexa.model.Notification;
import com.hexa.model.Order;
import com.hexa.model.Restaurant;
import com.hexa.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
