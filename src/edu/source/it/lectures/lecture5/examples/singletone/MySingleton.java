package edu.source.it.lectures.lecture5.examples.singletone;

public class MySingleton {
    private static MySingleton thiz = new MySingleton();

    private MySingleton() {}

    public static MySingleton getInstance() {
        return thiz;
    }
}
