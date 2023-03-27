package com.example.design.creat.singleton;

public class DoubleCheck {//    chỉ có 1 kết quả duy nhất
    private static DoubleCheck instance;
    private DoubleCheck(){}

    public static DoubleCheck getInstance(){
        if(instance == null){
            synchronized(DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
