package edu.source.it.lectures.lecture8.examples;

import edu.source.it.lectures.lecture7.examples.lists.User;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /*Set<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        Set<User> users = new TreeSet<>();
        users.add(new User("John"));
        users.add(new User("Mike"));
        users.add(new User("Sara"));
        users.add(new User("David"));
        for (User user : users) {
            System.out.println(user);
        }
    }
}
