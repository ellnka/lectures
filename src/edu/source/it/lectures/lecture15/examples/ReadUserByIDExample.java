package edu.source.it.lectures.lecture15.examples;

import edu.source.it.lectures.lecture15.examples.model.User;

import java.sql.*;
import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.CONNECTION_URL;
import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.SELECT_USER_SQL;

public class ReadUserByIDExample {
    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(CONNECTION_URL)) {
            PreparedStatement stmt = con.prepareStatement(SELECT_USER_SQL);
            stmt.setLong(1, 3);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getLong("ID"));
                user.setName(rs.getString("NAME"));
                user.setLastName(rs.getString("LASTNAME"));
                user.setLogin(rs.getString("LOGIN"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setEmail(rs.getString("EMAIl"));
                user.setUserRole(rs.getLong("USER_ROLE_ID"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
