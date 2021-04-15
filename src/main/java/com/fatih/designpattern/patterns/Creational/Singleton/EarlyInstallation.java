package com.fatih.designpattern.patterns.Creational.Singleton;

public class EarlyInstallation {
    private static EarlyInstallation obj = new EarlyInstallation();

    private EarlyInstallation() {

    }

    public static EarlyInstallation getEarlyInstallation() {
        return obj;

    }
    public void doSomething(){
        System.out.println("Early installation");
    }
}
