package com.fatih.designpattern.patterns.Behavioral.Command;

public class CommandCallClass {
    public  void call(){
        System.out.println("Command çalışıyor");
        Document doc = new Document();

        ActionListernerCommand clickOpen = new ActionOpen(doc);
        ActionListernerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
