package com.fatih.designpattern.patterns.Structural.Proxy;

public class ProxyCallClass {
    public void runProxyCallClass(){
        System.out.println("Proxy call class çalışıyor");
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
