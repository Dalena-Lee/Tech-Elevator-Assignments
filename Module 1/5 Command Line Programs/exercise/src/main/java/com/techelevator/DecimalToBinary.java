package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Prompt user to input a number to be converted.
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String input = scanner.nextLine();

		//Store values in an array using split.
		String[] decimalValues = input.split(" ");

		//Create a for loop to convert strings into doubles and then convert the number into a binary.
		//Convert the array values into a double.
		for (int i = 0; i < decimalValues.length; i++) {
			int number = Integer.parseInt(decimalValues[i]);
			//Create a new array to store double values.
			int[] stringToInt = new int[decimalValues.length];
			stringToInt[i] = number;

			//Create a new array to store binary values.
			int binaryArray[] = new int[10000];
			int index = 0;

			System.out.print("\n" + stringToInt[i] + " in binary is ");
			//Store remainder and divide the whole number by two until it equals 0.
			while (stringToInt[i] > 0) {
				binaryArray[index] = stringToInt[i] % 2;
				stringToInt[i] = stringToInt[i] / 2;
				index++;
			}
			for (int j = index - 1; j >= 0; j--) {
				System.out.print(binaryArray[j]);
			}



		}

	}
}
