package com.fatih.designpattern.patterns.Behavioral.Visitor;

public class VisitorCallClass {
    public  void call(){
        System.out.println("Visitor çalışıyor");
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
