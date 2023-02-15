package com.techelevator;

public class TriangleWall extends Wall{
    private int base;
    private int height;
    private String color;
    private String name;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    @Override
    public int getArea() {
        return (int)((double)(base * height) / (double)2);
    }

    public String toString(){
        return getName() + " (" + base + "x" + height + ") triangle";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
