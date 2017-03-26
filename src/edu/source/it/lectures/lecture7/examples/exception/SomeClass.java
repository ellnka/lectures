package edu.source.it.lectures.lecture7.examples.exception;

public class SomeClass implements SomeInterface {

    @Override
    public void doWork() throws RuntimeException{
        System.out.println("Doing work");
    }
}
