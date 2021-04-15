package com.fatih.designpattern.patterns.Behavioral.Strategy;

public class StrategyCallClass {
    public void call() {
        System.out.println("Strategy çalışıyor");

        float value1=5;

        float value2=3;
        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(value1, value2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));

    }
}
