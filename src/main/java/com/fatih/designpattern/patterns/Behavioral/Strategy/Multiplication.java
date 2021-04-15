package com.fatih.designpattern.patterns.Behavioral.Strategy;

public class Multiplication implements Strategy{

    @Override
    public float calculation(float a, float b){
        return a*b;
    }
}
