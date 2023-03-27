package com.example.design.creat.builder;

public class HouseBuilder implements Builder{

//   khai báo lại, phức tạp code
    private int walls;
    private int doors;
    private boolean hasRoof;
    private String color;
    public HouseBuilder(){
    }
    @Override
    public Builder buildRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }
    @Override
    public Builder buildWall(int walls) {this.walls = walls;
        return this;}
    @Override
    public Builder buildDoor(int doors) {
        this.doors = doors;
        return this;
    }
    @Override
    public Builder buildColor(String color) {
        this.color = color;
        return this;
    }
    @Override
    public House build() {
        return new House( walls,  doors,  hasRoof,  color);
    }
}
