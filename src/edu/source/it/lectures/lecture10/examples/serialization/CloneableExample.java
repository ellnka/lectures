package edu.source.it.lectures.lecture10.examples.serialization;

public class CloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();

        user.setName("John");
        user.setLastName("Black");
        user.setBirthday(new int[]{5, 5, 1998});

        User clone = user.clone();
        user.setName("Peter");
        user.getBirthday()[0] = 0;
        System.out.println(clone);
        System.out.println(user);
    }
}
