package com.example.springMVC;

public class Order {
	public int id;
	public String userId;
	public String product;
	public Order(int id, String userId, String product) {
		super();
		this.id = id;
		this.userId = userId;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", product=" + product + "]";
	}
	
}
