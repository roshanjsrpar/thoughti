package com.order.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.order.entity.Items;
import com.order.entity.Order;
import com.order.service.OrderService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTest {
	
	@Autowired
	public OrderService orderService;

private Order getOrders() {
		
		Items item = new Items(0,  "Bike",  "5", "8");
		
		
		return new Order(0, "",  "", "",  Arrays.asList(item));
	}
	
	
	@Test 
	public void getOrderTest() {
		Order orders = getOrders();
		orderService.addAllOrder(Arrays.asList(orders));
		Assertions.assertThat(orders.getOerderId()).isGreaterThan(0);
	}
	@Test 
	public void getAllorderTest() {
		Order orders = getOrders();
		orderService.addAllOrder(Arrays.asList(orders));
		List<Order> allorder = orderService.getAllorder();
		Assertions.assertThat(allorder.size()).isEqualTo(2);
	}
	@Test 
	public void getOrderByIdTest() {
		Order orders = getOrders();
		orderService.addAllOrder(Arrays.asList(orders));
		int id= orders.getOerderId();
		Optional<Order> findById = orderService.getOrderById(id);
		Assertions.assertThat(findById.isPresent()).isEqualTo(true);
	}

}
