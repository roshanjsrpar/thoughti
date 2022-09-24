package com.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderService {

@Autowired
private OrderRepository orderRepo;
	
	public List<Order> getAllorder()
	{
	  List<Order> order=new ArrayList<>();
	  
	  orderRepo.findAll().forEach(order::add);
	  return order;
	  
	}

	public void addAllOrder(List<Order> orders) {
		orderRepo.saveAll(orders);
		
	}

	public Optional<Order> getOrderById(int orderId) {
	return	orderRepo.findById(orderId);
		
	}

}
