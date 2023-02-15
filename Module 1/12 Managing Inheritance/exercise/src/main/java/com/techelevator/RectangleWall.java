package com.techelevator;

public class RectangleWall extends Wall{
    private int length;
    private int height;
    private String color;
    private String name;

    public RectangleWall(String name, String color, int length, int height){
        super(name, color);
        this.length = length;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public String toString(){
        return getName() + " (" + length + "x" + height + ") rectangle";
    }
    public int getHeight() { return height; }
    public int getLength() { return length; }

    @Override
    public int getArea() {
        return length * height; }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
}
