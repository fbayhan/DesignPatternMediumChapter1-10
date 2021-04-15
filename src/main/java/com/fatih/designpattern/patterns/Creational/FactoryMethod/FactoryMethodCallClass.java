package com.fatih.designpattern.patterns.Creational.FactoryMethod;

public class FactoryMethodCallClass {

    public String call(){

        GetPlanFactory planFactory=new GetPlanFactory();


        String planName="DOMESTICPLAN";
        int units=100;

        Plan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
        return "ok";
    }
}
