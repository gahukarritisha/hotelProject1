package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

import com.driver.ZomatoDriver;

public class Zomato {
	static Scanner sc = ZomatoDriver.sc;
	static ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	public static void admin() {
		Admin admin = new Admin();

	}
	public static void customer() {
		
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
