package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Items {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	@Column
	private int itemId;
	
	@Column
	private String itemName;
	
	@Column
	private String itemUnitPrice;
	
	@Column
	private String itemQuantity;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public Items(int itemId, String itemName, String itemUnitPrice, String itemQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.itemQuantity = itemQuantity;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
