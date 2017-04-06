package edu.source.it.lectures.lecture10.examples.serialization;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataOutputExample {
    private static final String FILE = "/Users/kblyumkin/Projects/SourceItLectures/resources/user.bin";

    public static void main(String[] args) throws IOException {

        User user = new User();
        user.setName("John");
        user.setLastName("Black");
        user.setBirthday(new int[]{5, 5, 1998});

        writeUser(user);

        User userFromFile = readUser();
        System.out.println(userFromFile);
    }


    private static User readUser() throws IOException {
        File file = new File(FILE);
        InputStream is = new GZIPInputStream(
                new BufferedInputStream(
                    new FileInputStream(file)));
        DataInput input = new DataInputStream(is);
        User result = new User();
        result.setName(input.readUTF());
        result.setLastName(input.readUTF());
        int[] birthday = new int[input.readInt()];
        for (int index = 0; index < birthday.length; index++) {
            birthday[index] = input.readInt();
        }
        result.setBirthday(birthday);
        is.close();
        return result;
    }

    private static void writeUser(User user) throws IOException {
        File file = new File(FILE);

        OutputStream os = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream(file)));

        DataOutput output = new DataOutputStream(os);

        output.writeUTF(user.getName());
        output.writeUTF(user.getLastName());
        output.writeInt(user.getBirthday().length);
        for (int sal : user.getBirthday()) {
            output.writeInt(sal);
        }
        os.flush();
        os.close();
    }
}
