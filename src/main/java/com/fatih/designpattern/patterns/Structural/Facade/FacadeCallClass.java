package com.fatih.designpattern.patterns.Structural.Facade;

public class FacadeCallClass {
    public void runFacade(){
        System.out.println("Facade çalışıyor");
        ShopKeeper sk=new ShopKeeper();
        sk.iphoneSale();
        sk.samsungSale();
        sk.blackberrySale();

    }
}
