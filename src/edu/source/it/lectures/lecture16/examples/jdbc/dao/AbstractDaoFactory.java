package edu.source.it.lectures.lecture16.examples.jdbc.dao;

public abstract class AbstractDaoFactory {
    public static AbstractDaoFactory getDaoFactory(Class type) {
        return new MySqlDaoFactory(type);
    }

    public abstract GenericDao getDao();
}
