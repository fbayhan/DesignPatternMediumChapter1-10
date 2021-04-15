package com.fatih.designpattern.patterns.Creational.AbstractFactoy;

public class AbstractFactoryCallClass {

    public  String call(){
        String bankName="ICICI";
        String loanName="Education";

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);
        double rate=2.2;
        double loanAmount=100;
        int years=2;

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);


        return "ok";
    }
}
