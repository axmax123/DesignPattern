package com.example.design.filter;

public class FilterMain {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new TrackingFilter());
        filterManager.addFilter(new AuthenticationFilter());

        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setClientID("192.168.1.1");
        httpRequest.setTargetID("/index");

        Client client = new Client(filterManager);
        client.sendRequest(httpRequest);

    }
}
