package edu.source.it.lectures.lecture15.examples;

import edu.source.it.lectures.lecture15.examples.constants.JdbcConstants;
import edu.source.it.lectures.lecture15.examples.model.NewUser;
import edu.source.it.lectures.lecture15.examples.model.User;
import edu.source.it.lectures.lecture15.examples.model.UserRole;

import java.sql.*;

import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.*;
import static edu.source.it.lectures.lecture15.examples.constants.JdbcConstants.SELECT_ALL_NEW_USERS_SQL;

public class SelectAllNewUsersExample {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(CONNECTION_URL)){
            PreparedStatement stmt = con.prepareStatement(SELECT_ALL_NEW_USERS_SQL);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                NewUser user = new NewUser();
                user.setId(rs.getLong("ID"));
                user.setName(rs.getString("NAME"));
                user.setLastName(rs.getString("LASTNAME"));
                user.setLogin(rs.getString("LOGIN"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setEmail(rs.getString("EMAIl"));

                UserRole role = new UserRole();
                role.setId(rs.getLong("USER_ROLE_ID"));
                role.setRole(rs.getString("ROLE"));

                user.setUserRole(role);
                System.out.println(user);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
