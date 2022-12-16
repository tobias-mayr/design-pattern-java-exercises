package org.designpatterns.chapter1.strategypattern.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
