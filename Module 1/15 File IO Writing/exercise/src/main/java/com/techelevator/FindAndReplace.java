package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the word you're searching for.");
        String searchTerm = userInput.nextLine();

        System.out.println("Please enter the replacement word.");
        String replacementTerm = userInput.nextLine();

        System.out.println("Please enter a path to the file.");
        String path = userInput.nextLine();
        File inputFile = new File(path);

        System.out.println("Please enter the destination of the file.");
        String destination = userInput.nextLine();
        File destinationFile = new File(destination);

        while (inputFile.exists() == false || inputFile.isFile() == false || destinationFile.exists() == false || destinationFile.isFile() == false) {
            try {
                if (inputFile.exists() == false) { // checks for the existence of a file
                    throw new FileNotFoundException("File " + path + " DOES NOT EXIST.");
                } else if (inputFile.isFile() == false) {
                    throw new IOException("File " + path + " IS NOT A FILE.");
                } else if (destinationFile.exists() == false) { // checks for the existence of a file
                    throw new FileNotFoundException("File " + destination + " DOES NOT XIST.");
                } else if (destinationFile.isFile() == false) {
                    throw new IOException("File " + destination + " IS NOT A FILE.");
                }

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (inputFile.exists() == false || inputFile.isFile() == false) {
                    System.out.println("Please enter a path to a source valid file.");
                    System.out.print("Path: ");
                    path = userInput.nextLine();
                    inputFile = new File(path);
                } else if (destinationFile.exists() == false || destinationFile.isFile() == false) {
                    System.out.println("Please enter a valid path to a destination file.");
                    System.out.println("Destination Path: ");
                    destination = userInput.nextLine();
                    destinationFile = new File(destination);
                }
            }
        }

        try (Scanner fileScanner = new Scanner(inputFile); PrintWriter fileWriter = new PrintWriter(destinationFile)) {
            while (fileScanner.hasNextLine()) {
                String eachLine = fileScanner.nextLine();
                if (eachLine.contains(searchTerm)){
                    fileWriter.println(eachLine.replaceAll(searchTerm, replacementTerm));
                }
                else {
                    fileWriter.println(eachLine);
                }
            }
            System.out.println("Replacement complete.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
