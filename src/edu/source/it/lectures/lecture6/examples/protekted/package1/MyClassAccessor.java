package edu.source.it.lectures.lecture6.examples.protekted.package1;

public class MyClassAccessor {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doWork();   //will work - we are in the same package
    }
}
