package edu.source.it.lectures.lecture13.examples.patterns.creation.builder;

public class User {
    private String login;   //required
    private String pwd;     //required
    private String address; //optional
    private long birthday;  //optional
    private String name;    //optional

    private User(UserBuilder builder) {
        this.login = builder.login;
        this.pwd = builder.pwd;
        this.address = builder.address;
        this.birthday = builder.birthday;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String login;   //required
        private String pwd;     //required
        private String address; //optional
        private long birthday;  //optional
        private String name;    //optional

        public UserBuilder() {}

        public UserBuilder login(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder pwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder birthday(long birthday) {
            this.birthday = birthday;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            if (login == null || pwd == null) {
                throw new IllegalArgumentException("Login and pwd could not be null!!");
            }
            return new User(this);
        }
    }
}
