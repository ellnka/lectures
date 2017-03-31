package edu.source.it.lectures.lecture8.examples;

import edu.source.it.lectures.lecture7.examples.lists.User;

import java.util.*;

import static java.util.Arrays.asList;

public class RemoveDuplicatesFromListExample {
    public static void main(String[] args) {
        List<User> users = asList(new User("John"), new User("Sara"),
                new User("Mike"), new User("David"), new User("Sara"),
                new User("Mike"), new User("David"));
        System.out.println(Arrays.toString
                (new ArrayList<>(new LinkedHashSet<>(users)).toArray()));


    }
}
