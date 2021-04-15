package com.fatih.designpattern.patterns.Creational.Builder;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public int price() {
        return 15;
    }
}
