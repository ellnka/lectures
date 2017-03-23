package edu.source.it.lectures.lecture6.examples.singletone;

public class MySingleton {
    private static MySingleton thiz = new MySingleton();

    private MySingleton() {}

    public static MySingleton getInstance() {
        return thiz;
    }
}
