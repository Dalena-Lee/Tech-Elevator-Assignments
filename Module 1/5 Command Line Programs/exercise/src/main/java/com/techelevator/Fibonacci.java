package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		//Get input.
		String input = scanner.nextLine();
		int fibonacciNum = Integer.parseInt(input);

		//Declare variables to add for fibonacci sequence.
		int a = 0; //Let a equal 0.
		int b = 1; //Let b equal 1.
		int sum = 0;

		System.out.print(a);

		//While loop stops when counter equals fibonacci number.
		while (sum < fibonacciNum) {
			//Print the number
			System.out.print(", " + b);

			//Swapping the numbers to add to the next number.
			sum = a + b;
			a = b;
			b = sum;
		}

	}

}
