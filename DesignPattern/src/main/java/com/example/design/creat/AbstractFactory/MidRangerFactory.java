package com.example.design.creat.AbstractFactory;

public class MidRangerFactory extends CakeTeaAbstractFactory{
    @Override
    Cake creatCake() {
        return new MidRanferCake();
    }

    @Override
    Tea creatTea() {
        return new MidRangerTea();
    }
}
