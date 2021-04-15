package com.fatih.designpattern.patterns.Behavioral.Command;

public class ActionOpen implements ActionListernerCommand {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }

}
