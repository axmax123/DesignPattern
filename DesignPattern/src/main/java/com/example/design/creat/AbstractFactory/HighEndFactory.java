package com.example.design.creat.AbstractFactory;

public class HighEndFactory extends CakeTeaAbstractFactory{

    @Override
    Cake creatCake() {
        return new HighEndCake();
    }

    @Override
    Tea creatTea() {
        return new HighEndTea();
    }
}
