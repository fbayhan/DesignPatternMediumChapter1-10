package com.fatih.designpattern.patterns.Structural.Adapter;

public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        String customername = "Fatih Bayhan";
        long accno = 1050L;
        String bankname = "Ak Bank";

        setAccHolderName(customername);
        setAccNumber(accno);
        setBankName(bankname);
    }


    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in " + bname + "bank is valid and authenticated for issuing the credit card. ");
    }
}
