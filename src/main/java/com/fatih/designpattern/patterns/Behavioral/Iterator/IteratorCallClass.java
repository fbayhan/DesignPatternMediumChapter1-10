package com.fatih.designpattern.patterns.Behavioral.Iterator;

public class IteratorCallClass {
    public  void call(){
        System.out.println("Iterator çalışıyor");

        CollectionofNames cmpnyRepository = new CollectionofNames();

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
