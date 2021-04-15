package com.fatih.designpattern.patterns.Behavioral.Command;

public class ActionSave implements ActionListernerCommand {
    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
