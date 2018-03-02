package com.jensonjo.spring.mockito_test.service;

import com.jensonjo.spring.mockito_test.unittesting.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BusinessService {

    @Autowired
    private DataService dataService;

    public BusinessService () {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data  = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value : data
             ) {
            if (greatest <value ) {
                greatest = value;
            }
        }
        return greatest;
    }
}
