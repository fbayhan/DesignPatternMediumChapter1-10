package com.fatih.designpattern.patterns.Creational.AbstractFactoy;

abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
