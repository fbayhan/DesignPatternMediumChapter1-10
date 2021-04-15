package com.fatih.designpattern.patterns.Behavioral.Observer;

import java.io.IOException;
import java.util.Observable;

public class ObserverCallClass   {
    public void call() {
        System.out.println("Observer çalışıyor");
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();

        // create first observer
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler1);


        // create second observer
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler2);

        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }


}
