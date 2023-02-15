package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		//Please enter the temperature: 58
		//Is the temperature in (C)elsius, or (F)ahrenheit? F
		//58F is 14C.
		Scanner scanner = new Scanner(System.in);
		double temperatureCelsius = 0;
		double temperatureFarenheit = 0;

		System.out.println("Please enter the temperature: ");
		String input = scanner.nextLine();
		int temperature = Integer.parseInt(input);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String celiusOrFahrenheit = scanner.nextLine();

		//Fahrenheit to Celsius
		if (celiusOrFahrenheit.equalsIgnoreCase("F")){
			temperatureFarenheit = temperature;
			temperatureCelsius = (temperatureFarenheit - 32) / 1.8;
			System.out.println(temperature + "F is " + (int)temperatureCelsius + "C");
		}

		//Celsius to Fahrenheit
		else if (celiusOrFahrenheit.equalsIgnoreCase("C")){
			temperatureCelsius = temperature;
			temperatureFarenheit = temperatureCelsius * 1.8 + 32;
			System.out.println(temperature + "C is " + (int)temperatureFarenheit + "F");
		}

	}

}
