package com.hotel;

import java.util.ArrayList;

class Customer {
	private String name;
	private String adress;
	private long contact;
	private double totalPrice = 0d;
	
	private Hotel hotel;
	private ArrayList<Item> order = new ArrayList<Item>();
	public Customer(String name, String adress, long contact, Hotel hotel) {
		
		this.name = name;
		this.adress = adress;
		this.contact = contact;
		this.hotel = hotel;
	}
	public void addItem() {
		// TODO Auto-generated method stub
		Item food = hotel.showMenu();
		
		if(food==null)return;
		if(!order.contains(food)) {
			System.out.println("insert quantity");
			food.setQuantity(Integer.parseInt(Zomato.sc.nextLine()));
			order.add(food);
			return;
		}
		if(food!=null) {
			food = order.remove(order.indexOf(food));
			System.out.println("insert quantity");
			food.setQuantity(Integer.parseInt(Zomato.sc.nextLine()));
			order.add(food);
		}
		
	}
	public void removeItem() {
		// TODO Auto-generated method stub
		Item food = hotel.showMenu();
		if(food!=null) {
			order.remove(food);
		}
		
	}
	public void showBill() {
		// TODO Auto-generated method stub
		totalPrice = 0d;
		for(Item item:order) {
			totalPrice+=item.getQuantity()*item.getPrice();
			System.out.println(item);
		}
		System.out.println("total price : "+totalPrice);
		
	}
	public boolean order() {
		// TODO Auto-generated method stub
		showBill();
		
		System.out.println("enter amount");
		Double amount = Double.parseDouble(Zomato.sc.nextLine());
		totalPrice-=amount;
		return totalPrice==0;
	}
	
	
	

}
