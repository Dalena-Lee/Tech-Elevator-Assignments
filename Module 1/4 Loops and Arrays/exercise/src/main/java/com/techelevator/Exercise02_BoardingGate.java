package com.techelevator;

public class Exercise02_BoardingGate {
    /*
    Local Jetways is a regional airline operating at local airports.
    They use a basic passenger manifest to represent seat occupancy on their plane.
        Each passenger seat is represented as an element in a boolean array.
        A value of TRUE indicates that seat is currently available.
        A value of FALSE indicates the seat is not available.
     */

    /*
    A nearby airport has an incoming flight from Local Jetways. As the passengers disembark, the gate
    attendant's first responsibility is to generate a new seating chart with each seat initially available.

    Implement the logic to generate a seating chart using the required number of seats. Make sure to indicate
    that each seat is initially available (TRUE).

    Note: The number of seats is guaranteed not to be negative.

    Examples:
    generateSeatingChart(7) → [true, true, true, true, true, true, true]
    generateSeatingChart(5) → [true, true, true, true, true]
    generateSeatingChart(2) → [true, true]
     */
    public boolean[] generateSeatingChart(int numberOfSeats) {
        //Create a new array with a fixed size equal to numberOfSeats
        boolean[] availableSeats = new boolean[numberOfSeats];

        //Create a for loop that goes through numberOfSeats and set it to true.
        for (int i = 0; i < numberOfSeats; i++) {
            //guarantee that the number of seats is always true.
            availableSeats[i] = true;
        }

        return availableSeats;
    }

    /*
    Once passengers begin boarding the plane, gate attendants need a way to determine how many available
    seats there are on the plane.

    Using the array provided, implement the logic to count the number of available seats in the seating chart.
    A seat is available if the value is TRUE.

    Examples:
    getAvailableSeatCount([true, false, false, false]) → 1
    getAvailableSeatCount([false, false, false, false, false, false]) → 0
    getAvailableSeatCount([true, true, true, false]) → 3
    getAvailableSeatCount([]) → 0
     */
    public int getAvailableSeatCount(boolean[] seatingChart) {
        //Create a variable to count number of seats available.
        int count = 0;
        //Create a for loop that iterates through the seatingChart.
        for (int i = 0; i < seatingChart.length; i++){
            //Check if the seat is available.
            if (seatingChart[i]) {
                count += 1;
            }
        }
        //Return the number of seats available.
        return count;
    }

    /*
    The crew determined that it would be nice to know how many rows on the plane are at full occupancy.
    Each row has three seats and a row is at full occupancy if all three seats have someone sitting in them.

    Using the boolean array, implement the logic to count the number of full rows on the plane.
    Note: A new row starts at every third element. For example, row one begins with index 0, row two begins with index 3, and so on.

    Examples:
    getNumberOfFullRows([false, false, false, true, true, true]) → 1
    getNumberOfFullRows([true, true, true, true, true, true]) → 2
    getNumberOfFullRows([false, true, true, false, true, true]) → 0
     */
    public int getNumberOfFullRows(boolean[] seatingChart) {
        //Create a variable to count the number of rows that are occupied.
        int occupiedRows = 0;

        //Create a for loop that iterates through the seatingChart.
        for (int i = 0; i < seatingChart.length; i++){
            //If index[i] has a remainder of 2, check the previous two indices.
            if (i % 3 == 2) {
                //Check if the third element is occupied. If true, move on.
                if (seatingChart[i] == false) {
                    if (seatingChart[i - 1] == false){
                        if (seatingChart[i - 2] == false) {
                            occupiedRows += 1;
                        }
                    }
                }
            }
        }
        //Return the number of seats available.
        return occupiedRows;
    }
}
