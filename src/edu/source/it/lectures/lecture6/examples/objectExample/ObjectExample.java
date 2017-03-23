package edu.source.it.lectures.lecture6.examples.objectExample;

import edu.source.it.lectures.lecture3.examples.userExample.User;

public class ObjectExample {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.hashCode());

        System.out.println(user.equals(user));
    }
}
