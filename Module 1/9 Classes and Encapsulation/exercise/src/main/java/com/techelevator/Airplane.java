package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats ;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats ;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
        this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
            if (forFirstClass){
                if (totalNumberOfSeats <= availableFirstClassSeats) {
                    bookedFirstClassSeats += totalNumberOfSeats;
                    availableFirstClassSeats -= totalNumberOfSeats;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (totalNumberOfSeats <= availableCoachSeats) {
                    bookedCoachSeats += totalNumberOfSeats;
                    availableCoachSeats -= totalNumberOfSeats;
                    return true;
                }
                else {
                    return false;
                }
            }
        }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return availableCoachSeats;
    }
}
