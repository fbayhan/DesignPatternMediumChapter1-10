package com.fatih.designpattern.patterns.Creational.AbstractFactoy;

public class ICICI implements Bank{
    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
