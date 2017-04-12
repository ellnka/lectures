package edu.source.it.lectures.lecture11.examples.ex5;

public class NotifyExample {
    public static void main(String[] args) {
        Object object = new Object();
        synchronized (object) {
            object.notify();
        }
    }
}
