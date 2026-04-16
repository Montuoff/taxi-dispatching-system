package com.taxi.dispatcher.service;

import org.springframework.stereotype.Service;

@Service
public class DispatcherService {

    public String findNearestDriver(String startAddress) {
        return "Driver found at " + startAddress;
    }
}