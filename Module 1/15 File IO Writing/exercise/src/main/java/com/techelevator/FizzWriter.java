package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the destination of the file.");
		String destination = userInput.nextLine();
		File destinationFile = new File(destination);

		try (PrintWriter fileWriter = new PrintWriter(destinationFile)) {
			for (int i = 1; i < 301; i++){
				if (i % 3 == 0 && i % 5 == 0){
					fileWriter.println("FizzBuzz");
				}
				else if (i % 3 == 0) {
					fileWriter.println("Fizz");
				}
				else if (i % 5 == 0) {
					fileWriter.println("Buzz");
				}
				else {
					fileWriter.println(i);
				}
			}
			System.out.println("FizzBuzz complete.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
