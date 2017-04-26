package edu.source.it.lectures.lecture15.examples.constants;

public class JdbcConstants {
    public final static String CONNECTION_URL       = "jdbc:mysql://127.0.0.1:3306/SourceIt?user=root&password=12345";
    public final static String SELECT_USER_SQL      = "SELECT ID, NAME, LASTNAME, LOGIN, PASSWORD, " +
            "                                         EMAIL, USER_ROLE_ID FROM USERS WHERE ID = ?";
    public final static String SELECT_ALL_USERS_SQL = "SELECT ID, NAME, LASTNAME, LOGIN, PASSWORD, " +
                                                      "EMAIL, USER_ROLE_ID FROM USERS";
    public final static String INSERT_USER_SQL      = "INSERT INTO USERS (NAME, LASTNAME, LOGIN, PASSWORD, EMAIL, " +
                                                      "USER_ROLE_ID) VALUES (?, ?, ?, ?, ?, ?)";
    public final static String DELETE_USER_SQL      = "DELETE FROM USERS WHERE ID > ?";

    public final static String SELECT_ALL_NEW_USERS_SQL = "SELECT \n" +
            "    U.ID,\n" +
            "    U.NAME,\n" +
            "    U.LASTNAME,\n" +
            "    U.LOGIN,\n" +
            "    U.PASSWORD,\n" +
            "    U.EMAIL,\n" +
            "    U.USER_ROLE_ID,\n" +
            "    UR.ROLE\n" +
            "FROM\n" +
            "    USERS U\n" +
            "        JOIN\n" +
            "    USER_ROLES UR ON U.USER_ROLE_ID = UR.ID;";
    private JdbcConstants() {}
}
