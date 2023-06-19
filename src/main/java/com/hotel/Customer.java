package com.hotel;

import java.util.ArrayList;

public class Customer {
	Hotel hotel;
	ArrayList<Item> order = new ArrayList<Item>();
	public Customer() {
		
		hotel = Zomato.getHotel();
	}

}
