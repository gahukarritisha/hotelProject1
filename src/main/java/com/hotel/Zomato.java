package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

import com.driver.ZomatoDriver;

public class Zomato {
	static Scanner sc = ZomatoDriver.sc;
	private static ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	public static void admin() {
		Admin admin = new Admin();
		int choice = 1000;
		while(choice!=0) {
			admin.addFood(getHotel());
			admin.addHotel(hotels);
			System.out.println();
			choice = Integer.parseInt(sc.nextLine());
		}

	}
	public static void customer() {
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter adress");
		String adress = sc.nextLine();
		System.out.println("enter contact");
		long contact = Long.parseLong(sc.nextLine());
		Customer customer = new Customer(name,adress,contact,getHotel());
		int choice = 1000;
		while(choice!=0) {
			customer.addItem();
			customer.removeItem();
			customer.showBill();
			customer.order();
			
			System.out.println();
			choice = Integer.parseInt(sc.nextLine());
		}
		
	}
	protected static Hotel getHotel() {
		System.err.println("choose hotel");
		int i = 1;
		for(Hotel hotel:hotels) {
			System.out.println(i++ + hotel.toString());
			
		}
		int choice = Integer.parseInt(sc.nextLine());
		return hotels.get(choice-1);
	}

}
