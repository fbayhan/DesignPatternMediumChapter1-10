package com.fatih.designpattern.patterns.Structural.PrivateClassData;

public class PrivateClassCallClass {
    public void runPrivateClass() {
        System.out.println("private class çalışıyor");
        Stew stew = new Stew(1, 2, 3, 4);
        stew.mix();   // Mixing the stew we find: 1 potatoes, 2 carrots, 3 meat and 4 peppers
        stew.taste(); // Tasting the stew
        stew.mix();   // Mixing the stew we find: 0 potatoes, 1 carrots, 2 meat and 3 peppers
        ImmutableStew immutableStew = new ImmutableStew(2, 4, 3, 6);
        immutableStew.mix();


    }
}
