package edu.source.it.lectures.lecture7.examples.sets;

import edu.source.it.lectures.lecture7.examples.lists.User;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample  {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>(32);
        Set<User> users1 = new HashSet<>(32, 0.75f);
        users.add(new User("John"));
        users.add(new User("John"));

        //users.remove(new User("John"));



        System.out.println(users.contains(new User("John")));
        for (User user : users) {
            System.out.println(user);
        }
    }
}
