package com.fatih.designpattern.patterns.Structural.PrivateClassData;

public class Stew {
    private int numPotatoes;
    private int numCarrots;
    private int numMeat;
    private int numPeppers;

    public Stew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
        this.numPotatoes = numPotatoes;
        this.numCarrots = numCarrots;
        this.numMeat = numMeat;
        this.numPeppers = numPeppers;
    }

    public void mix() {

        System.out.println("Mixing the stew we find: {} potatoes, {} carrots, {} meat and {} peppers" +
                numPotatoes + " " + numCarrots + " " + numMeat + " " + numPeppers);
    }

    public void taste() {
        System.out.println("Tasting the stew");
        if (numPotatoes > 0) {
            numPotatoes--;
        }
        if (numCarrots > 0) {
            numCarrots--;
        }
        if (numMeat > 0) {
            numMeat--;
        }
        if (numPeppers > 0) {
            numPeppers--;
        }
    }
}
