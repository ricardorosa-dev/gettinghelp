CREATE TABLE band (
	id INTEGER PRIMARY KEY, 
	name VARCHAR(100) NOT NULL,
	genre VARCHAR(100) NOT NULL,
	year INTEGER NOT NULL);

CREATE TABLE musician (
	id INTEGER PRIMARY KEY, 
	name VARCHAR(100) NOT NULL, 
	Date_of_Birth DATE NOT NULL);