package com.example.design.creat.builder;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildWall(int walls);
    Builder buildDoor(int doors);
    Builder buildColor(String color);
    House build();

}
