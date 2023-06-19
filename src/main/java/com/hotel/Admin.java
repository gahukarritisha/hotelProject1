package com.hotel;

public class Admin {
	Hotel hotel;
	public void addHotel() {
		// TODO Auto-generated method stub
		String name = Zomato.sc.nextLine();
		Zomato.hotels.add(new Hotel(name));

	}
	public void addFood() {
		hotel = Zomato.getHotel();
		hotel.addFood();
	}

}
