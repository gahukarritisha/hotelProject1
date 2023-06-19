package com.hotel;

class Item {

	private String name;
	private double price;
	private int quantity;
	public Item(String name, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean equals(Object object) {
		Item item = (Item)object;
		return this.toString().equals(item.toString());
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
