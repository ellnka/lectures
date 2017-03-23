package edu.source.it.lectures.lecture6.examples.protekted.package3;

import edu.source.it.lectures.lecture6.examples.protekted.package1.MyClass;
import edu.source.it.lectures.lecture6.examples.protekted.package2.AnotherMyClass;

public class MyClassAccessor {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //myClass.doWork();   //will not compile - MyClass is in another package
        AnotherMyClass anotherMyClass = new AnotherMyClass();
        //anotherMyClass.doWork(); //will not compile - AnotherMyClass is in another package
    }
}
