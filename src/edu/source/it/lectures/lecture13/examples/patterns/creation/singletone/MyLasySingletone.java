package edu.source.it.lectures.lecture13.examples.patterns.creation.singletone;

import edu.source.it.lectures.lecture6.examples.objectExample.ObjectExample;

public class MyLasySingletone {
    private static MyLasySingletone thiz;
    private static Object lock = new Object();

    private MyLasySingletone() {}

    public /*synchronized*/ static MyLasySingletone getInstance() {
        if (thiz == null) {
            synchronized (lock) {
                if (thiz == null) {
                    thiz = new MyLasySingletone();
                }
            }
        }
        return thiz;
    }
}
