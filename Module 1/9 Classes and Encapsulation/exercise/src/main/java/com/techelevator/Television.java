package com.techelevator;

public class Television {
    boolean isOn;
    int currentChannel = 3;
    int currentVolume = 2;

    public void turnOff(){
        this.isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void changeChannel(int newChannel){
        if (isOn == true && newChannel >= 3 && newChannel <= 18) {
            currentChannel = newChannel;
        }
    }
    public void channelUp(){
        if (isOn == true){
            if (currentChannel == 18){
                currentChannel = 3;
            } else {
                currentChannel++;
            }
        }
    }
    public void channelDown(){
        if (isOn == true){
            if (currentChannel == 3){
                currentChannel = 18;
            } else {
                currentChannel--;
            }
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void raiseVolume(){
        if (isOn == true){
            if (currentVolume < 10) {
                currentVolume++;
            }
        }
    }
    public void lowerVolume(){
        if (isOn == true){
            if (currentVolume > 0) {
                currentVolume--;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
