package edu.source.it.lectures.lecture11.examples.ex2;

public class CurrentThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();

        System.out.println("Thread name = " + thread.getName());
        Thread.sleep(1000);
        System.out.println("Hello world!");
    }
}
