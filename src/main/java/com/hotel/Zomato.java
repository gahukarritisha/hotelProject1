package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

import com.driver.ZomatoDriver;

public class Zomato {
	static Scanner sc = ZomatoDriver.sc;
	private static ArrayList<Hotel> hotels = new ArrayList<Hotel>();

	public static void admin() {

		Admin admin = new Admin();
		int choice;
		do {
			System.out.println("1.add food    2.add hotel   0.exit");

			choice = Integer.parseInt(sc.nextLine());
			try {
				if (choice == 1)
					admin.addFood(getHotel());
				if (choice == 2)
					admin.addHotel(hotels);
				if (choice == 0)
					return;

			} catch (NoHotelException e) {
				System.out.println("no hotels present");
			}
		} while (true);

	}

	public static void customer() {
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter adress");
		String adress = sc.nextLine();
		System.out.println("enter contact");
		long contact = Long.parseLong(sc.nextLine());
		Customer customer = null;
		try {
			customer = new Customer(name, adress, contact, getHotel());
		} catch (NoHotelException e) {
			System.out.println("no hotel present");
			return;
		}
		
		int choice = 1000;
		while (choice != 0) {
			System.out.println("1.Add item    2.remove Item    3.showBill    4.order   0.exit");
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1)
				customer.addItem();
			if (choice == 2)
				customer.removeItem();
			if (choice == 3)
				customer.showBill();
			if (choice == 4)
				if (customer.order())
					break;

		}
		System.out.println("thanks for visiting");

	}

	protected static Hotel getHotel() throws NoHotelException {
		if (hotels.size() == 0) {
			throw new NoHotelException();
		}
		System.err.println("choose hotel");
		int i = 1;
		for (Hotel hotel : hotels) {
			System.out.println(i++ + hotel.toString());

		}
		int choice = Integer.parseInt(sc.nextLine());
		return hotels.get(choice - 1);
	}

}
