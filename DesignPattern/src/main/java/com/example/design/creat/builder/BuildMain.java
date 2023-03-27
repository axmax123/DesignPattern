package com.example.design.creat.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuildMain {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWall(6)
                .buildDoor(10)
                .buildRoof(true)
                .buildColor("white")
                .build();
    log.info(String.valueOf(house));
    }
}
