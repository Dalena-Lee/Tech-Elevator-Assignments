package com.techelevator;

import javax.crypto.spec.PSource;

public class FruitTree {
    //Creating variables that allow for loosely coupled code!
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    //FruitTree Constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        //Update and initialize;
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        //If tree has more fruit than the number of fruits to pick, return true.
        if (piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
        return false;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
}
