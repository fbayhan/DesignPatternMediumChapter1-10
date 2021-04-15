package com.fatih.designpattern.patterns.Structural.Bridge;

public class BridgeCallClass {

    public void runBridge(){
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();
        questions.display();
        questions.delete("what is class?");
        questions.display();
        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();

        System.out.println("runBridge çalışıyor");
    }
}
