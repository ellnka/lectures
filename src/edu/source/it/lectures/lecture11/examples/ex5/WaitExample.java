package edu.source.it.lectures.lecture11.examples.ex5;

public class WaitExample {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object) {
            object.wait();
        }
    }
}
