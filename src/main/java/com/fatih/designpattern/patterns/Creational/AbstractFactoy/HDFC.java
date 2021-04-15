package com.fatih.designpattern.patterns.Creational.AbstractFactoy;

public class HDFC implements Bank{

    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
