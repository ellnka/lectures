package edu.source.it.lectures.lecture7.examples.lists;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        User john = new User("John");

        System.out.println(users.add(john));
        users.add(new User("Mike"));
        users.add(new User("Peter"));
        users.add(john);

        /*List<User> newUsers = new ArrayList<>();
        newUsers.add(john);
        users.retainAll(newUsers);*/

        //System.out.println(users.get(10));
        users.get(0);

        for (User user : users) {
            System.out.println(user);
        }

        Iterator<User> iter = users.iterator();
        while (iter.hasNext()) {
            User user = iter.next();
            if (user.equals(john)) {
                iter.remove();
            }
        }

        /*for (User user : users) {
            if (user.equals(john)) {
                users.remove(john);
                users.add(new User("1"));
            }
        }*/
        System.out.println("-------------");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
