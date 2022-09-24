package com.order.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.order.entity.Items;
import com.order.entity.Order;

@DataJpaTest
public class OrderRepositoryTest {
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	private Order getOrders() {
		
		Items item = new Items(0,  "Bike",  "5", "8");
		
		
		return new Order(0, "",  "", "",  Arrays.asList(item));
	}
	
	
	@Test 
	public void saveOrderTest() {
		Order orders = getOrders();
		orderRepo.save(orders);
		Assertions.assertThat(orders.getOerderId()).isGreaterThan(0);
	}
	@Test 
	public void findOrderTest() {
		Order orders = getOrders();
		orderRepo.save(orders);
		List<Order> findAll = orderRepo.findAll();
		Assertions.assertThat(findAll.size()).isEqualTo(1);
	}
	@Test 
	public void findByIdOrderTest() {
		Order orders = getOrders();
		orderRepo.save(orders);
		int id= orders.getOerderId();
		Optional<Order> findById = orderRepo.findById(id);
		Assertions.assertThat(findById.isPresent()).isEqualTo(true);
	}

}
