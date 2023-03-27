package com.example.design.creat.AbstractFactory;

public class CakeTeaFactory {
    public static CakeTeaAbstractFactory getFactory(Type type){
        switch (type){
            case HIGH_END:
                return new HighEndFactory();
            case MID_RANGER:
                return new MidRangerFactory();
            default:
                throw new UnsupportedOperationException("exception");}

    }
}
