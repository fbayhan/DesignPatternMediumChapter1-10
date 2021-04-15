package com.fatih.designpattern.patterns.Creational.Singleton;

public class LazyInstallation {
    private static LazyInstallation obj;

    private LazyInstallation() {
    }

    public static LazyInstallation getLazyInstallation() {
        if (obj == null) {
            synchronized (LazyInstallation.class) {
                if (obj == null) {
                    obj = new LazyInstallation();

                }
            }
        }
        return obj;
    }

    public void doSomething() {
        System.out.println("Lazy installation");
    }

}
