package com.revature.models;

import com.revature.app.Converter;
import com.revature.models.Conversions;
import java.util.Scanner;

/*
 * This class contains the following menu methods for the Unit Converter Program 
 * 
 * 1. Main Menu Method
 * 2. Volume Conversions Menu Method
 * 3. Distance Conversions Menu Method
 * 
 */

public class Menus {
	static Scanner input = new Scanner(System.in);
	
	public double mainMenu() {
		int choice;

		Menus obj1 = new Menus();
		

		do {
			System.out.println("========================================");
			System.out.println("Welcome to the Unit Converter Program");
			System.out.println("========================================");
			System.out.println("1. Volume Conversions");
			System.out.println("2. Distance Conversions");
			System.out.println("3. Quit");
			System.out.println("========================================");
			System.out.print("Please select an option: ");
			choice = input.nextInt();

			switch (choice) {

			case 1:

				obj1.volumeConversions();

				break;

			case 2:
				obj1.distanceConversions();

				break;

			case 3:
				System.out.println();
				System.out.println("Quitting Program...");
				System.exit(0);
				break;

			default:
				System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

			}

		} while (choice != 3);

		return 0;
	}

	public double volumeConversions() {
		int choice;
		Conversions obj1 = new Conversions();
		Menus obj2 = new Menus();

		do {
			System.out.println("========================================");
			System.out.println("Volume Conversions");
			System.out.println("========================================");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Tablespoons to Teaspoons");
			System.out.println("3. Go Back");
			System.out.println("4. Quit");
			System.out.println("========================================");
			System.out.print("Please select an option: ");
			choice = input.nextInt();

			switch (choice) {

			case 1:
				obj1.cupsToTeaspoons();

				break;

			case 2:
				obj1.tablespoonsToTeaspoons();
				break;

			case 3:
				obj2.mainMenu();
				break;
			case 4:
				System.out.println();
				System.out.println("Quitting Program...");
				System.exit(0);

			default:
				System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

			}

		} while (choice != 4);

		return 0;

	}

	public double distanceConversions() {
		int choice;
		Conversions obj1 = new Conversions();
		Menus obj2 = new Menus();

		do {
			System.out.println("========================================");
			System.out.println("Distance Conversions");
			System.out.println("========================================");
			System.out.println("1. Miles to Kilometers");
			System.out.println("2. Feet to Meters");
			System.out.println("3. Go Back");
			System.out.println("4. Quit");

			System.out.println("========================================");
			System.out.print("Please select an option: ");
			choice = input.nextInt();

			switch (choice) {

			case 1:
				obj1.milesToKilometers();
				break;

			case 2:
				obj1.feetToMeters();
				break;

			case 3:
				obj2.mainMenu();

			case 4:
				System.out.println();
				System.out.println("Quitting Program...");
				System.exit(0);
				break;

			default:
				System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

			}

		} while (choice != 4);

		return 0;

	}

}
