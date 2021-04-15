package com.fatih.designpattern.patterns.Behavioral.Template;

public class TemplateCallClass {
    public  void call() throws IllegalAccessException, InstantiationException, ClassNotFoundException {


        System.out.println("Template çalışıyor");
      //  Class c=Class.forName("args[0]");



        Game game = new Chess();
     //   game=(Game) c.newInstance();
        game.play();
        System.out.println();
        game = new Soccer();
        game.play();
    }
}
