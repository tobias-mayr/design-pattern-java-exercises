package org.designpatterns.chapter1.strategypattern.objects;

import org.designpatterns.chapter1.strategypattern.behaviours.QuackBehaviour;

public class Device {
    QuackBehaviour quackBehaviour;

    public Device() {}

    public void performQuack() {
        quackBehaviour.quack();
    }
}
