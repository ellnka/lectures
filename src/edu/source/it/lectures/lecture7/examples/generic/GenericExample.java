package edu.source.it.lectures.lecture7.examples.generic;

import edu.source.it.lectures.lecture3.examples.userExample.User;

public class GenericExample {
    public static void main(String[] args) {
        GenericClass<String> genenricStrings = new GenericClass<>();

        genenricStrings.writeAndReturnFirst("To", "be", "or", "not", "to", "be");

        GenericClass anyObjects = new GenericClass();

        anyObjects.writeAndReturnFirst(new Object(), new User(), "qwerty", new Long(10), 105);

        GenericClass<User> genericUsers = new GenericClass<User>();

        genericUsers.writeAndReturnFirst(new User(), new User());
    }
}
