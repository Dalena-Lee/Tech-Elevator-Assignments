package com.techelevator;

public class SquareWall extends RectangleWall{
    private String color;
    private String name;
    private int sidelength;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        this.sidelength = sideLength;
        this.name = name;
        this.color = color;
    }

    public String toString(){
        return getName() + " (" + sidelength + "x" + sidelength + ") square";
    }

    @Override
    public int getArea() {
        return sidelength * sidelength;
    }

    public int getSidelength() {
        return sidelength;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
