package com.fatih.designpattern.patterns.Structural.Facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Samsung galaxy tab 3 ");
    }

    @Override
    public void price() {
        System.out.println(" Rs 45000.00 ");
    }
}
