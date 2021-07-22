package com.revature.models;

import java.util.Scanner;

/*
 * This class contains the following conversion methods for the Unit Converter Program 
 * 
 * 1. Cups to Teaspoons
 * 2. Tablespoons to Teaspoons 
 * 3. Miles to Kilometers
 * 4. Feet to Meters
 *  
 */
public class Conversions {
	static Scanner input = new Scanner(System.in);

	public double cupsToTeaspoons() {
		System.out.print("Enter a number of Cups: ");
		double cups, teaspoons;
		cups = input.nextDouble();
		teaspoons = cups * 48;
		System.out.println(cups + " Cups is equal to " + teaspoons + " Teaspoons ");
		return 0;

	}

	public double tablespoonsToTeaspoons() {
		System.out.print("Enter a number of Tablespoons: ");
		double tablespoons, teaspoons;
		tablespoons = input.nextDouble();
		teaspoons = tablespoons * 3;
		System.out.println(tablespoons + " Tablespoons is equal to " + teaspoons + " Teaspoons ");
		return 0;
	}

	public double milesToKilometers() {
		System.out.print("Enter a number of Miles: ");
		double miles, kilometers;
		miles = input.nextDouble();
		kilometers = miles * 1.609344;
		System.out.println(miles + " Miles is equal to " + kilometers + " Kilometers ");
		return 0;

	}

	public double feetToMeters() {
		System.out.print("Enter a number of Feet: ");
		double feet, meters;
		feet = input.nextDouble();
		meters = feet * 0.3048;
		System.out.println(feet + " Feet is equal to " + meters + " Meters ");
		return 0;
	}

}
