DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS PROPOSALS;
DROP TABLE IF EXISTS INITIATIVES;

CREATE TABLE USERS (
  ID int NOT NULL AUTO_INCREMENT,
  USERNAME varchar(15) NOT NULL,
  PASSWORD varchar(15) NOT NULL,
  NAME varchar(40) NOT NULL,
  ACCOUNT varchar(45) NOT NULL,
  AVATAR varchar(80) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE INITIATIVES (
  ID int NOT NULL,
  NAME varchar(40) NOT NULL,
  DESCRIPTION varchar(255) NOT NULL,
  CREATION_DATE datetime NOT NULL,
  START_DATE datetime NOT NULL,
  END_DATE datetime NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE PROPOSALS (
  ID int NOT NULL AUTO_INCREMENT,
  NAME varchar(80) NOT NULL,
  IMAGE varchar(80) NOT NULL,
  VOTES int NOT NULL,
  INITIATIVE_ID int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (INITIATIVE_ID) REFERENCES INITIATIVES(ID)
);

INSERT INTO USERS VALUES
	(1,'peter.griffin', 'admin','Peter Griffin','0x89a3bbdb44cbfb06bda06d8b7ee4dc11317c6a7b','/images/peter-griffin.jpg'),
	(2,'lois.griffin', 'admin','Lois Griffin','0x297755c2cfec9054fdb18228f0c8a8500e9f4b53','/images/lois-griffin.png'),
	(3,'stewie.griffin', 'admin','Stewie Griffin','0xb58eab5e7a29d574ca81bb72025da3f0f863168c','/images/stewie-griffin.jpg'),
	(4,'meg.griffin', 'admin','Meg Griffin','0x8b0a1742efad797f30ac385acbbe0c2c912dde4e','/images/meg-griffin.png'),
	(5,'chris.griffin', 'admin','Chris Griffin','0xfeb6acfa6da1c677aab4c992424a0ab9f8066f2e','/images/chris-griffin.jpg'),
	(6,'brian.griffin', 'admin','Brian Griffin','0x600aa65866ef4252b49e2ff2e84cc392aebf69ed','/images/brian-griffin.jpg'),
	(7,'quagmire', 'admin','Quagmire','0xa40018664ef79fcbe44b3af7c7b73b7d44e65e71','/images/quagmire.jpg'),
	(8,'cleveland', 'admin','Cleveland','0x785de2eea37ae369cddda5c6503b732a4a752f7c','/images/cleveland.jpg');


INSERT INTO INITIATIVES VALUES
	(1,'Weekend getaway','Lets organize a trip for next weekend','2012-04-28 12:01','2012-04-28 12:01','2012-04-28 12:01'),
	(2,'Solidarity concert','Summer Solidary Concerts','2012-04-28 12:01','2012-04-28 12:01','2012-04-28 12:01'),
	(3,'Painting workshop','This workshop is aimed at the more experienced landscape oil painter','2012-04-28 12:01','2012-04-28 12:01','2012-04-28 12:01'),
	(4,'Name of a new playground','Selecting a name for the new playground','2012-04-28 12:01','2012-04-28 12:01','2012-04-28 12:01');

INSERT INTO PROPOSALS VALUES
	(1,'Proposal 1','/images/proposals/painting-workshop-01.jpg',7,3),
	(2,'Proposal 2','/images/proposals/painting-workshop-02.jpeg',5,3),
	(3,'Proposal 3','/images/proposals/painting-workshop-03.jpg',6,3),
	(4,'Proposal 4','/images/proposals/painting-workshop-04.jpg',0,3),
	(5,'Proposal 5','/images/proposals/painting-workshop-05.jpg',2,3);
