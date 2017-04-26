package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.command;

public class Light {
    private boolean on;

    public void switchOn() {
        this.on = true;
        System.out.println("Light is on!");
    }

    public void switchOff() {
        this.on = false;
        System.out.println("Light is off!");
    }

}
