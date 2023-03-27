package com.example.design.structure.adapterPattern;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class TranslateAdapter implements Taget{

    private EnglishAdapter englishAdapter;
    public TranslateAdapter(EnglishAdapter adapter){
    this.englishAdapter = adapter;

    }
    @Override
    public void sendMessage(String word) {
//        System.out.println("Reading Words ...");
//        System.out.println(word);
//        String vietnameseWords = this.translate(word);
//        System.out.println("Sending Words ...");
//        englishAdapter.receive(vietnameseWords);
        log.info("Reading Words ...");
        log.info(word);
        String vietnameseWords = this.translate(word);
        log.info("Sending Words ...");
        englishAdapter.receive(vietnameseWords);

    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "Hello";
    }

}
