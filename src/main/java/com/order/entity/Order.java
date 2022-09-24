package com.order.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int orderId;

	@Column
	private String orderDate;

	@Column
	private String orderStatus;

	@Column
	private String collectionOfItems;

	@OneToMany(targetEntity = Items.class, cascade = CascadeType.ALL)
	public List<Items> items;

	public int getOerderId() {
		return orderId;
	}

	public void setOerderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCollectionOfItems() {
		return collectionOfItems;
	}

	public void setCollectionOfItems(String collectionOfItems) {
		this.collectionOfItems = collectionOfItems;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Order(int orderId, String orderDate, String orderStatus, String collectionOfItems, List<Items> items) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.collectionOfItems = collectionOfItems;
		this.items = items;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
