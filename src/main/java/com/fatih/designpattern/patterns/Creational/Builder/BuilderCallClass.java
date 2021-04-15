package com.fatih.designpattern.patterns.Creational.Builder;

public class BuilderCallClass {
    public void runBuilder(){
        System.out.println("Builder çalışıyor");
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }
}
