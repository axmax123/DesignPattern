package com.example.design.creat.builder;

public class House {
    // tạo phương thức get
    private int walls;
    private int doors;
    private boolean hasRoof;
    private String color;
    public House(int walls, int doors, boolean hasRoof, String color) {
        this.walls = walls;
        this.doors = doors;
        this.hasRoof = hasRoof;
        this.color = color;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }
}
