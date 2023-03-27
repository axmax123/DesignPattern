package com.example.design.creat.singleton;

public class ThreadSafe {
//    chỉ có 1 kết quả duy nhất
private static ThreadSafe instance;

    private ThreadSafe(){}

    public static synchronized ThreadSafe getInstance(){
        if(instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
