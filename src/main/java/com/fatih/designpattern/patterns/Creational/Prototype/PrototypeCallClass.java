package com.fatih.designpattern.patterns.Creational.Prototype;

public class PrototypeCallClass {


    public void runPrototype() {
        int eid = 5;
        String ename = "Fatih";
        String edesignation = "computer engineer";
        String eaddress = "balgat";
        double esalary = 6000;

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
        e1.showRecord();
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
