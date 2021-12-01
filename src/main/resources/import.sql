INSERT INTO band (name, genre, year) VALUES ('Tool', 'rock', 1990);
INSERT INTO band (name, genre, year) VALUES ('Soen', 'progressive metal', 2010);

INSERT INTO musician (name, Date_of_Birth) VALUES ('Maynard James Keenan', TO_DATE('17-04-1964', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Adam Jones', TO_DATE('15-01-1965', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Danny Carey', TO_DATE('10-05-1961', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Justin Chancellor', TO_DATE('19-09-1971', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Martin Lopez', TO_DATE('20-05-1978', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Joel Ekelöf', TO_DATE('01-08-1980', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Cody Lee Ford', TO_DATE('01-01-2000', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Oleksii Kobel', TO_DATE('01-01-2000', 'dd-MM-yyyy'));
INSERT INTO musician (name, Date_of_Birth) VALUES ('Lars Åhlund', TO_DATE('01-01-2000', 'dd-MM-yyyy'));

INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (1, 1, 1990, 'vocals');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (1, 2, 1990, 'guitars');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (1, 3, 1990, 'drums');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (1, 4, 1995, 'bass');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (2, 5, 2010, 'drums');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (2, 6, 2010, 'vocals');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (2, 7, 2018, 'guitar');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (2, 8, 2020, 'bass');
INSERT INTO band_musician (band_id, musician_id, joined, role) VALUES (2, 9, 2014, 'keyboards');