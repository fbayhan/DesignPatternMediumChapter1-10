package com.fatih.designpattern.patterns.Structural.Decorator;

public class DecoratorCallClass {
    public  void  runDecorator(){
        System.out.println("Decorator çalışıyor");

        VegFood vf=new VegFood();
        System.out.println(vf.prepareFood());
        System.out.println( vf.foodPrice());

        Food f1=new NonVegFood((Food) new VegFood());
        System.out.println(f1.prepareFood());
        System.out.println( f1.foodPrice());

        Food f2=new ChineeseFood((Food) new VegFood());
        System.out.println(f2.prepareFood());
        System.out.println( f2.foodPrice());
    }
}
