package edu.source.it.lectures.lecture7.examples.generic;

public class GenericClass<T> {

    public T writeAndReturnFirst(T...objects) {
        for (T t : objects) {
            System.out.println(t);
        }
        if (objects.length == 0) {
            return null;
        }
        return objects[0];
    }
}
