package edu.source.it.lectures.lecture6.examples.singletone;

public class MyLasySingletone {
    private static MyLasySingletone thiz;

    private MyLasySingletone() {}

    public static MyLasySingletone getInstance() {
        if (thiz == null) {
            thiz = new MyLasySingletone();
        }
        return thiz;
    }
}
