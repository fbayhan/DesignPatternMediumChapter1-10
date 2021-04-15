package com.fatih.designpattern.patterns.Structural.Flyweight;

public class FlyWeightCallClass {
    public  void runFlyWeight(){
        System.out.println("flyweight çalışıyor");


        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
