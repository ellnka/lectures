package edu.source.it.lectures.lecture12.examples.joinexamples;

public class JoinDeadLockExample {
    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().join();
    }
}
