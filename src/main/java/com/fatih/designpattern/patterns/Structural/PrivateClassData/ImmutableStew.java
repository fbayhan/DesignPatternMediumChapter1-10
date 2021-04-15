package com.fatih.designpattern.patterns.Structural.PrivateClassData;

public class ImmutableStew {
    private final StewData data;

    public ImmutableStew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
        data = new StewData(numPotatoes, numCarrots, numMeat, numPeppers);
    }

    public void mix() {
        System.out.println("Mixing the immutable stew we find: {} potatoes, {} carrots, {} meat and {} peppers" + " " +
                data.getNumPotatoes() + " " + data.getNumCarrots() + " " + data.getNumMeat() + " " + data.getNumPeppers());
    }
}
