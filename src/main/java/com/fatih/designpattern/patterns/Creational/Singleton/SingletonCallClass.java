package com.fatih.designpattern.patterns.Creational.Singleton;

public class SingletonCallClass {

    public String call() {
        EarlyInstallation earlyInstallation = EarlyInstallation.getEarlyInstallation();
        earlyInstallation.doSomething();
        LazyInstallation lazyInstallation=LazyInstallation.getLazyInstallation();
        lazyInstallation.doSomething();

        return "ok";
    }
}
