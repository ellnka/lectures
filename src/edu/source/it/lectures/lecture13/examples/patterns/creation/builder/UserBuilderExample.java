package edu.source.it.lectures.lecture13.examples.patterns.creation.builder;

import java.util.Date;

public class UserBuilderExample {
    public static void main(String[] args) {
        User newUser = new User.UserBuilder()
                .login("login")
                .pwd("pass")
                .build();

        User existingUser = new User.UserBuilder()
                .login("log")
                .pwd("password")
                .address("Kharkov")
                .birthday(new Date().getTime())
                .name("John Smith")
                .build();

        //User wrongUser = new User.UserBuilder().login("wrong").build();

        System.out.println("new user = " + newUser);
        System.out.println("existing user = " + existingUser);
        //System.out.println("wrong user " + wrongUser);
    }
}
