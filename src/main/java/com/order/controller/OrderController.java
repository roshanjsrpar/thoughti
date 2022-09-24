package com.order.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.order.entity.Order;
import com.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> getAllOrder()
	{
		return orderService.getAllorder();
	}
	
	@PostMapping("order/create")
	public void addAllOrder(@RequestBody List<Order> orders)
	{
		orderService.addAllOrder(orders);
	}
	@GetMapping("order/{orderId}")
	public Object getAllOrder(@PathVariable int orderId)
	{
		 Optional<Order> order = orderService.getOrderById(orderId);
		 
		 return order.isPresent()?order.get():"Data is not present for id : "+orderId;
	}
	
}

