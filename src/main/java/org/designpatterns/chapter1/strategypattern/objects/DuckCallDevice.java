package org.designpatterns.chapter1.strategypattern.objects;

import org.designpatterns.chapter1.strategypattern.behaviours.Quack;

public class DuckCallDevice extends Device {

    public DuckCallDevice () {
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a device that quacks");
    }
}
