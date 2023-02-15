package com.techelevator;

public abstract class Wall {
    private String name;
    private String color;

    public Wall(String name, String color){}

    public abstract int getArea();
    public abstract String getName();
    public abstract String getColor();
}
