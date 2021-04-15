package com.fatih.designpattern.patterns.Behavioral.Command;

public class MenuOptions {
    private ActionListernerCommand openCommand;
    private ActionListernerCommand saveCommand;

    public MenuOptions(ActionListernerCommand open, ActionListernerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
        openCommand.execute();
    }
    public void clickSave(){
        saveCommand.execute();
    }
}
