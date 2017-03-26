package edu.source.it.lectures.lecture7.examples.garbage;

public class ObjectWithFinalize {

    public void doWork() {}

    @Override
    public void finalize() {
        System.out.println("In finilize");
    }
}
