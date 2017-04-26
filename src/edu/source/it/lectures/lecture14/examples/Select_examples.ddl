#Get all users-
SELECT * FROM USERS;

#Update - Sara changed her lastname
UPDATE USERS
SET
    LASTNAME = 'White'
WHERE
    LOGIN = 'Sara';

#Delete user by id -
DELETE FROM USERS WHERE ID = 2;

#Get all users with admin role (inner select) -
SELECT
    *
FROM
    USERS
WHERE
    USER_ROLE_ID IN (SELECT
            ID
        FROM
            USER_ROLES
        WHERE
            ROLE = 'Admin');

#Get quantity of users with client role (inner select) -
SELECT
    COUNT(0)
FROM
    USERS
WHERE
    USER_ROLE_ID IN (SELECT
            ID
        FROM
            USER_ROLES
        WHERE
            ROLE = 'Client');

#Get quantity of users with role = 2. Aggregate function example
SELECT
    USER_ROLE_ID, COUNT(USER_ROLE_ID)
FROM
    USERS
GROUP BY USER_ROLE_ID
HAVING USER_ROLE_ID = 2;

#Join example -
SELECT
    *
FROM
    USER_ROLES UR
    LEFT JOIN
    USERS U
        ON U.USER_ROLE_ID = UR.ID;


SELECT * FROM USER_ROLES;

