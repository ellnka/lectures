package edu.source.it.lectures.lecture15.examples;

import edu.source.it.lectures.lecture15.examples.model.User;

import java.sql.*;
import java.util.Random;

import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.CONNECTION_URL;
import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.INSERT_USER_SQL;

public class InsertUserExample {
    public static void main(String[] args) {
        User user = createRandomClient();
        try (Connection con = DriverManager.getConnection(CONNECTION_URL)) {
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            PreparedStatement stmt = con.prepareStatement(INSERT_USER_SQL);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getLogin());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getEmail());
            stmt.setLong(6, user.getUserRole());
            int quantity = stmt.executeUpdate();
            //con.commit();
            System.out.println(quantity + " user(s) were inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static User createRandomClient() {
        User user = new User();
        user.setName(randomString());
        user.setLastName(randomString());
        user.setLogin(randomString());
        user.setPassword(randomString());
        user.setEmail(randomString());
        user.setUserRole(2);
        return user;
    }

    private static String randomString() {
        Random random = new Random();
        int length = random.nextInt(5) + 3;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = (char) ((random.nextInt(26) + 65) + (random.nextInt(2) * 32)) ;
        }
        return String.valueOf(result);
    }
}
