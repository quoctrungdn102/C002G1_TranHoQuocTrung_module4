package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService implements IConversionService {
    public double convert(double usd){
        double result = usd*24000;
        return  result;
    }
}
