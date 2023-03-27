package com.example.design.creat.singleton;
//khởi tạo khi get instance
//chỉ chạy khi được gọi
public class Lazy {
        private static Lazy instance;

        private Lazy(){}

        public static Lazy getInstance(){
            if(instance == null){
                instance = new Lazy();
            }
            return instance;
        }

    public static void setInstance(Lazy instance) {
        Lazy.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    }


