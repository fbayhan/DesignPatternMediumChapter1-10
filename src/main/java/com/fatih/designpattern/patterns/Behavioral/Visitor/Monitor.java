package com.fatih.designpattern.patterns.Behavioral.Visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

       computerPartVisitor.visit(this);
    }
}