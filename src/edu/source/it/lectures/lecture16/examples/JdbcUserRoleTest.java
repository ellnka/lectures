package edu.source.it.lectures.lecture16.examples;

import edu.source.it.lectures.lecture16.examples.jdbc.dao.AbstractDaoFactory;
import edu.source.it.lectures.lecture16.examples.jdbc.dao.GenericDao;
import edu.source.it.lectures.lecture16.examples.jdbc.model.User;
import edu.source.it.lectures.lecture16.examples.jdbc.model.UserRole;

public class JdbcUserRoleTest {
    public static void main(String[] args) {
        GenericDao<UserRole, Long> userRoleDao =
                AbstractDaoFactory.getDaoFactory(UserRole.class).getDao();

       /* System.out.println(userRoleDao.read(1L));


        UserRole role = new UserRole();
        role.setRole("Tech specialist");
        long id = userRoleDao.create(role);
        System.out.println("Role created " + role);*/

        UserRole role = userRoleDao.read(5L);
        role.setRole("New Role1");
        //role.setId(6L);
        userRoleDao.update(role);

        //userRoleDao.delete(role);
    }
}
