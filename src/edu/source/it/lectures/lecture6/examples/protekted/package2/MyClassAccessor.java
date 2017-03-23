package edu.source.it.lectures.lecture6.examples.protekted.package2;

import edu.source.it.lectures.lecture6.examples.protekted.package1.MyClass;

public class MyClassAccessor {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //myClass.doWork();   //will not compile - MyClass is in another package
        AnotherMyClass anotherMyClass = new AnotherMyClass();
        anotherMyClass.doWork(); //Declared in parent in another package
    }
}
