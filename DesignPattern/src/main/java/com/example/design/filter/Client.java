package com.example.design.filter;

public class Client {
    private FilterManager filterManager;
    public Client(FilterManager filterManager){
    this.filterManager = filterManager;
    }
    public void sendRequest(HttpRequest httpRequest) {
    filterManager.filterRequest(httpRequest);
    }
}
