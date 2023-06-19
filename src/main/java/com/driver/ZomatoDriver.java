package com.driver;

import java.util.Scanner;

import com.hotel.Zomato;

public class ZomatoDriver {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("choose the option");
			System.out.println("1.login as  admin  2.log in as Customer");
			try {
				int a = Integer.parseInt(sc.nextLine());
				if (a == 1) {
					Zomato.admin();
					}
				if (a == 2) {
					Zomato.customer();
					
				}
				if(a==0)
					return;
			} catch (Exception e) {

				System.out.println("please choose the correct option");
			}

		} while (true);

	}

}
