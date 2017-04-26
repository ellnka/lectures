CREATE TABLE `SourceIT`.`USERS` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(45) NOT NULL,
  `LASTNAME` VARCHAR(45) NOT NULL,
  `LOGIN` VARCHAR(45) NOT NULL,
  `PASSWORD` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `USER_ROLE_ID` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `LOGIN_UNIQUE` (`LOGIN` ASC),
  UNIQUE INDEX `EMAIL_UNIQUE` (`EMAIL` ASC));


CREATE TABLE `SourceIT`.`USER_ROLES` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `ROLE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ROLE_UNIQUE` (`ROLE` ASC));

ALTER TABLE `SourceIT`.`USERS`
CHANGE COLUMN `USER_ROLE_ID` `USER_ROLE_ID` INT NOT NULL ,
ADD INDEX `FK_USER_ROLE_idx` (`USER_ROLE_ID` ASC);
ALTER TABLE `SourceIT`.`USERS`
ADD CONSTRAINT `FK_USER_ROLE`
FOREIGN KEY (`USER_ROLE_ID`)
REFERENCES `SourceIT`.`USER_ROLES` (`ID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

INSERT INTO `SourceIT`.`USER_ROLES` (`ROLE`) VALUES ('Admin');
INSERT INTO `SourceIT`.`USER_ROLES` (`ROLE`) VALUES ('Client');

INSERT INTO `SourceIT`.`USERS` (`NAME`, `LASTNAME`, `LOGIN`, `PASSWORD`, `EMAIL`, `USER_ROLE_ID`) VALUES ('Mike', 'Smith', 'mike', '123', 'mike@mysite.com', '1');
INSERT INTO `SourceIT`.`USERS` (`NAME`, `LASTNAME`, `LOGIN`, `PASSWORD`, `EMAIL`, `USER_ROLE_ID`) VALUES ('John', 'Good', 'john', '1234', 'john@mysite.com', '2');
INSERT INTO `SourceIT`.`USERS` (`NAME`, `LASTNAME`, `LOGIN`, `PASSWORD`, `EMAIL`, `USER_ROLE_ID`) VALUES ('Sara', 'Black', 'sara', '12343', 'sara@mysite.com', '2');
INSERT INTO `SourceIT`.`USERS` (`NAME`, `LASTNAME`, `LOGIN`, `PASSWORD`, `EMAIL`, `USER_ROLE_ID`) VALUES ('Jonny', 'Trueman', 'jonny', '321', 'jonny@mysite.com', '2');


