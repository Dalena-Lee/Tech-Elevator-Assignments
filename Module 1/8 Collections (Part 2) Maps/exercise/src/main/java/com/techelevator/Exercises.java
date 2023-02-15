package com.techelevator;

import java.util.*;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "Herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String,String> animalGroup = new HashMap<String,String>();

		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Pride");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");

		if (animalName == null){
			return "unknown";
		}

		String lowerCaseAnimalName = animalName.toLowerCase();
		String returnedGroupName = animalGroup.get(lowerCaseAnimalName);

		if (returnedGroupName == null) {
			return "unknown";
		}

		return returnedGroupName;
	}

	/*
	 * Given a String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String,Double> itemsAndDiscount = new HashMap<String,Double>();
		itemsAndDiscount.put("KITCHEN4001", 0.20);
		itemsAndDiscount.put("GARAGE1070", 0.15);
		itemsAndDiscount.put("LIVINGROOM", 0.10);
		itemsAndDiscount.put("KITCHEN6073", 0.40);
		itemsAndDiscount.put("BEDROOM3434", 0.60);
		itemsAndDiscount.put("BATH0073", 0.15);

		if(itemNumber == null || itemNumber.equals("")){
			return 0.0;
		}

		String item = itemNumber.toUpperCase();
		Double discount = itemsAndDiscount.get(item);

		if(discount == null){
			return 0.0;
		}

		return discount;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		//Declare variable for transfer amount, Peter's money, and Paul's money.
		double peterMoney = peterPaul.get("Peter");
		double paulMoney = peterPaul.get("Paul");
		double transferAmount = peterMoney / 2;

		//If Peter's key > 0 AND Paul's key < 1000
		if (peterMoney > 0 && paulMoney < 1000){

			//Update Peter's key
			peterMoney = peterMoney / 2;
			peterMoney = Math.round(peterMoney);
			peterPaul.put("Peter", (int)peterMoney);

			//Update Paul's key
			paulMoney += transferAmount;
			peterPaul.put("Paul", (int)paulMoney);
		}
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		//Create variables for partnershipAmount and keys.
		double peter = peterPaul.get("Peter");
		double paul = peterPaul.get("Paul");
		double partnershipAmount = 0;

		//If Peter has 5000 or more AND Paul has 10000 or more
		if(peter >= 5000 && paul >= 10000) {
			//Create a new PeterPaulPartnership = Peter's key / 2 + Paul's key / 2
			partnershipAmount = (peter / 4) + (paul / 4);
			peterPaul.put("PeterPaulPartnership", (int)partnershipAmount);

			//Create variables for updated keys
			double peterKey = peter - (peter / 4);
			double paulKey = paul - (paul / 4);

			//Update Peter's key
			peterPaul.put("Peter",(int)peterKey);
			//Update Paul's key
			peterPaul.put("Paul", (int)paulKey);
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		//Create a map; key: first character; value: last character
		Map<String,String> firstAndLast = new HashMap<String,String>();

		//Create a foreach loop and assign.
		for(String eachElement: words){
			//Create variables for first and last letters.
			String a = "" + eachElement.charAt(0);
			String b = "" + eachElement.charAt(eachElement.length()-1);
			firstAndLast.put(a, b);
		}

		return firstAndLast;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		//Create a map.
		Map<String, Integer> eachString = new HashMap<String, Integer>();

		for(String str: words) {
			int count = 0;
			//Create a variable to count the number of times a key exists.
			if (eachString.containsKey(str)) { //If str already exists, increment and update.
				count = eachString.get(str);
				count++;
				eachString.put(str, count);
			} else {
				count++;
				eachString.put(str, count);
			}
		}
		return eachString;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		//Create a map.
		Map<Integer, Integer> eachInt = new HashMap<Integer, Integer>();

		for(int num: ints) {
			int count = 0;
			//Create a variable to count the number of times a key exists.
			if (eachInt.containsKey(num)) { //If num already exists, increment and update.
				count = eachInt.get(num);
				count++;
				eachInt.put(num, count);
			} else {
				count++;
				eachInt.put(num, count);
			}
		}
		return eachInt;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		//Create a map.
		Map<String, Boolean> trueOrFalse = new HashMap<String, Boolean>();
		//Create a list containing unique keys.
		List<String> uniqueVar = new ArrayList<>();

		//Create foreach loop that adds keys only once.
		for(String str: words){
			if(!uniqueVar.contains(str)){
				uniqueVar.add(str);
			}
		}

		//Create a foreach loop that increments
		for(int i = 0; i < uniqueVar.size(); i++){
			String currentLetter = uniqueVar.get(i);
			int count = 0;
			//Create a nested loop to count how many times the letter appears
				for (int j = 0; j < words.length; j++){
					if(words[j].equals(currentLetter)){
						count++;
					}
			}
				if (count >= 2){
					trueOrFalse.put(currentLetter, true);
				}
				else{
					trueOrFalse.put(currentLetter, false);
				}
		}

		return trueOrFalse;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {

		//Create a foreach loop that goes through map2.
		for (Map.Entry<String, Integer> mergeMaps: remoteWarehouse.entrySet()){
			String mapKey = mergeMaps.getKey();
			//If map1 contains the key in map2
			if (mainWarehouse.containsKey(mapKey)){
				//Calculate and update the key for map 1
				int a = mainWarehouse.get(mapKey);
				int b = remoteWarehouse.get(mapKey);

				int updateValue = a + b;
				mainWarehouse.put(mapKey, updateValue);
			}
			//If map1 does not contain the key
			else {
				//Add the key and its value to map1
				int value = remoteWarehouse.get(mapKey);
				mainWarehouse.put(mapKey,value);
			}
		}
		return mainWarehouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		//Create a map.
		Map<String, Integer> last2Revisist = new HashMap<String, Integer>();

		//Create a for loop that iterates through each string
		for(String str: words) {
			int count = 0;
			String last2 = "";

			//If the last2 cannot reappear.
			if (str.equals("") || str.length() <= 3) {
				count = 0;
			}

			//Creating an array to check pairs of chars, and creating the last2 condition.
			String array[] = new String[str.length() - 1];
			last2 = str.substring(str.length() - 2);

			//Iterate through the length of the string.
			for (int i = 0; i < array.length - 2; i++) {
				array[i] = str.substring(i, i + 2);
				//If the array is the same as the last two, increment count.
				if (array[i].equals(last2)) {
					count++;
				}
			}

			//In the case of 'xxxx':
			if (str.length() == 4) {
				if (count > 0 && str.substring(str.length() - 2, (str.length() - 1)).equals(str.substring(str.length() - 1))) {
					count++;
				}
			}
			last2Revisist.put(str, count);
		}
		return last2Revisist;
	}

}
