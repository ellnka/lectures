package edu.source.it.lectures.lecture10.examples.serialization;

import java.io.*;

public class LetsSerializeExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setName("John");
        user.setLastName("Black");
        user.setBirthday(new int[]{05, 05, 1998});
        user.setAddress(new Address("Main", 100, "Kiev"));
        User newUser = copy(user);
        user.setName("Peter");
        user.getBirthday()[0] = 0;

        System.out.println(newUser);
        System.out.println(user);

    }

    private static <T extends Serializable> T copy(T origin) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(origin);

        oos.flush();
        oos.close();

        byte[] data = baos.toByteArray();
        //System.out.println(new String(data));
        ObjectInput objectInput = new ObjectInputStream(
                new ByteArrayInputStream(data));

        return (T) objectInput.readObject();
    }
}
