package com.example.design.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TrackingFilter implements Filter{
    @Override
    public void foFilter(HttpRequest httpRequest) {
        log.info("Tracking request: " + httpRequest);
    }
}
