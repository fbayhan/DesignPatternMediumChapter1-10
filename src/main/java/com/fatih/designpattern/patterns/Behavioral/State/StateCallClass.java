package com.fatih.designpattern.patterns.Behavioral.State;

public class StateCallClass {



    public  void call(){
        System.out.println("State çalışıyor");
        new StatePatternDemo("management");
        new StatePatternDemo("sales");
        new StatePatternDemo("accounting");


    }
}
