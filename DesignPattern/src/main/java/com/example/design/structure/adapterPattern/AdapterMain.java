package com.example.design.structure.adapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        Taget client = new TranslateAdapter(new EnglishAdapter());
        client.sendMessage("Xin chào");
    }
}
