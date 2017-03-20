package edu.source.it.lectures.lecture5.examples.singletone;

public class MySingltoneTest {
    public static void main(String[] args) {
        MySingleton first = MySingleton.getInstance();
        MySingleton second = MySingleton.getInstance();
        System.out.println(first.equals(second));
    }
}
