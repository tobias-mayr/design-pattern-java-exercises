package org.designpatterns.chapter1.strategypattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
