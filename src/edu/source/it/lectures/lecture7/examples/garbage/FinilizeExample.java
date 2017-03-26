package edu.source.it.lectures.lecture7.examples.garbage;

public class FinilizeExample {
    public static void main(String[] args) {
        ObjectWithFinalize o = new ObjectWithFinalize();
        o.doWork();
        o = null;
        System.gc();
        for (int i = 0; i < 1_000_000; i++){
            ObjectWithFinalize o1 = new ObjectWithFinalize();
            o1.doWork();
        }

    }
}
