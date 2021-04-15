package com.fatih.designpattern.patterns.Behavioral.Strategy;

public class Addition implements Strategy{
    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
