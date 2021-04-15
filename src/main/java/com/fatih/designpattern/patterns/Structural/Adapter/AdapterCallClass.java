package com.fatih.designpattern.patterns.Structural.Adapter;

public class AdapterCallClass {
    public void runAdapter() {
        System.out.println("Adapter çalışıyor");
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
