package com.fatih.designpattern.patterns.Behavioral.Mediator;

public class MediatorCallClass {
    public  void call(){
        System.out.println("Mediator çalışıyor");
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setname("Ashwani Rajput");
        u1.sendMsg("Hi Ashwani! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Soono Jaiswal");
        u2.sendMsg("I am Fine ! You tell?");
    }
}
