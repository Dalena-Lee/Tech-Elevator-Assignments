package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the length: ");
		String input = scanner.nextLine();
		int length = Integer.parseInt(input);
		double meters = 0;
		double feet = 0;

		System.out.println("Is the measurement in (m)eter, or (f)eet? f");
		String meterOrFeet = scanner.nextLine();

		//Meters to feet.
		if (meterOrFeet.equalsIgnoreCase("m")) {
			meters = length;
			feet = meters * 3.2808399;
			System.out.println(length + "m is " + (int) feet + "f");
		}

		//Feet to meters
		else if (meterOrFeet.equalsIgnoreCase("f")) {
			feet = length;
			meters = feet * 0.3048;
			System.out.println(length + "f is " + (int) meters + "m");
		}

	}
}
