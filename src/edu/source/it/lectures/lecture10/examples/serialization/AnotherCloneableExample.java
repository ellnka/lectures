package edu.source.it.lectures.lecture10.examples.serialization;

public class AnotherCloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User() {{
            setName("Mike");
            setBirthday(new int[]{5, 5, 1998});
            setLastName("Smith");
            setAddress(new Address("Main", 50, "Kharkiv"));
        }};

        User clone = user.clone();
        clone.setName("John");
        clone.getAddress().setCity("Kiev");
        System.out.println(user);
        System.out.println(clone);

    }

}
