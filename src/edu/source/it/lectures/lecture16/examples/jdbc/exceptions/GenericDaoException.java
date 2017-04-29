package edu.source.it.lectures.lecture16.examples.jdbc.exceptions;

public class GenericDaoException extends RuntimeException {
    public GenericDaoException(String reason) {
        super(reason);
    }

    public GenericDaoException(String reason, Exception e) {
        super(reason, e);
    }
}
