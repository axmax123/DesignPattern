package com.example.design.creat.AbstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractFactoryMain {
    public static void main(String[] args) {
        CakeTeaAbstractFactory highEndFactory = CakeTeaFactory.getFactory(Type.HIGH_END);
        Tea highEndTea = highEndFactory.creatTea();
        Cake highEndCake = highEndFactory.creatCake();
        log.info(highEndTea.getSegment());
        log.info(highEndCake.getCake());

        log.info("=========================");

        CakeTeaAbstractFactory midRagerFactory = CakeTeaFactory.getFactory(Type.MID_RANGER);
        Tea midRangetea = midRagerFactory.creatTea();
        Cake midRangecake = midRagerFactory.creatCake();
        log.info(midRangetea.getSegment());
        log.info(midRangecake.getCake());

    }
}
