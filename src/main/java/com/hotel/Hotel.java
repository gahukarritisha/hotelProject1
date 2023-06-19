package com.hotel;

import java.util.ArrayList;

class Hotel {

	
	private String name;
	public Hotel(String name) {
		super();
		this.name = name;
	}
	
	ArrayList<Item> foods = new ArrayList<Item>();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public Item showMenu() {
		
		
		
		
		System.err.println("type 0 to exit");
		System.err.println("choose hotel");
		int i = 1;
		for(Item food:foods) {
			System.out.println(i++ + food.toString());
			
		}
		int choice = Integer.parseInt(Zomato.sc.nextLine());
		return choice==0?null:foods.get(choice-1);
	}
	public void addFood() {
		// TODO Auto-generated method stub
		System.out.println("enter name");
		String name = Zomato.sc.nextLine();
		System.out.println("enter price");
		double price = Double.parseDouble(Zomato.sc.nextLine());
		foods.add(new Item(name,price));
	}

}
