package edu.source.it.lectures.lecture3.examples.userExample;

public class UserTest {
    static String s;
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Tom");
        user.setFirstName("John");
        user.sayHi();
        doSmth(user);
        System.out.println(user.getWriteCounter());
        System.out.println(s);

    }

    static void doSmth(User user) {
        user.write("Hello World");
    }
}
