package com.example.design.abtract;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public abstract class animal {
//    Protected Access Modifier
//    Protected Access Modifier là có thể truy cập bên trong package và bên ngoài package nhưng chỉ thông qua tính kế thừa.
    protected double weight;
    protected double height;

    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "animal{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void showInfo(){
        log.info("This is a animal");
    }

//    trừu tượng - chưa biết tiếng kêu của động vật
    public abstract void makeSound();
}
