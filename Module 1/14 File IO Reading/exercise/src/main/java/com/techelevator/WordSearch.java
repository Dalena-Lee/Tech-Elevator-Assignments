package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a path to input file: ");
		System.out.print("Path: ");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		String isCaseSensitive = "";

		while (inputFile.exists() == false || inputFile.isFile() == false) {
			try {
				if (inputFile.exists() == false) { // checks for the existence of a file
					throw new FileNotFoundException(path + " does not exist.");
				} else if (inputFile.isFile() == false) {
					throw new IOException(path + " is not a file.");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter path to a valid file.");
				System.out.println("Path: ");
				path = userInput.nextLine();

			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter path to a valid file.");
				System.out.print("Path: ");
				path = userInput.nextLine();
			}
		}

		System.out.println("Please enter a word to search for: ");
		String searchTerm = userInput.nextLine();

		System.out.println("Is the word you're looking for case sensitive? [Y][N]");
		isCaseSensitive = userInput.nextLine();

		while ((!isCaseSensitive.equalsIgnoreCase("y") && !isCaseSensitive.equalsIgnoreCase("n"))) {
			try {
				if (!isCaseSensitive.equalsIgnoreCase("y") && !isCaseSensitive.equalsIgnoreCase("n")) {
					throw new IllegalArgumentException("Please enter Y or N.");
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				isCaseSensitive = userInput.nextLine();
			}
		}

		boolean choice = (isCaseSensitive.equalsIgnoreCase("y") ? true : false);
		int countLine = 0;

		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				countLine++;
				String eachLine = fileScanner.nextLine();
				if (choice) {
					if (eachLine.contains(searchTerm)) {
						System.out.println(countLine + ": " + eachLine);
					}
				} else {
					if (eachLine.toLowerCase().contains(searchTerm.toLowerCase())) {
						System.out.println(countLine + ": " + eachLine);
					}
				}
			}
		}

	}
}

