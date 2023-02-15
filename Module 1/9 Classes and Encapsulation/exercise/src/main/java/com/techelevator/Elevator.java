package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels){
        this.currentFloor = 1;
        this.numberOfFloors = numberOfLevels;
        this.doorOpen = isDoorOpen();
    }

    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor) {
        if (!doorOpen) {
            if (desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
                currentFloor = desiredFloor;
            }
        }
    }

    public void goDown(int desiredFloor){
        if (!doorOpen){
            if (desiredFloor >= 1 && desiredFloor < currentFloor) {
                currentFloor = desiredFloor;
            }
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
