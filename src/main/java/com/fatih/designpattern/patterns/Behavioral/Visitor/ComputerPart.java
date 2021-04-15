package com.fatih.designpattern.patterns.Behavioral.Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
