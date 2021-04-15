package com.fatih.designpattern.patterns.Behavioral.Observer;

import java.util.Observable;

public class EventSource extends Observable implements Runnable  {
    @Override
    public void run() {
        int a = 1;
        while (a<100) {
            System.out.println(a);
            String response = String.valueOf(a);
            setChanged();
            notifyObservers(response);
            a++;
        }
    }
}
