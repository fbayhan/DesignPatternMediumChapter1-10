package com.fatih.designpattern.patterns.Behavioral.Memento;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state=state;
    }
    public String getState() {
        return state;
    }
}