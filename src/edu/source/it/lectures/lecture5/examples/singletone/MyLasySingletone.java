package edu.source.it.lectures.lecture5.examples.singletone;

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
