package edu.source.it.lectures.lecture3.examples.userExample;

public class User {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private long birthday;
    private int writeCounter;

    public User() {

    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public int getWriteCounter() {
        return writeCounter;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void write(String whatToWrite) {
        System.out.println(whatToWrite);
        writeCounter++;
    }

    public void sayHi() {
        System.out.println("Hi, I'm " + firstName);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", writeCounter=" + writeCounter +
                '}';
    }
}
