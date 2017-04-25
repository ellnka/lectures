package edu.source.it.lectures.lecture13.examples.patterns.creation.prototype;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComplicatedObject object = new ComplicatedObject().loadData();
        ComplicatedObject another = (ComplicatedObject)object.clone();

        another.getStrings().add("Some new Data");

        System.out.println(object.equals(another));
        System.out.println(object);
        System.out.println(another);
    }
}
