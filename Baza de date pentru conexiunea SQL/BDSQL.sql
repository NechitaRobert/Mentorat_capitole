CREATE DATABASE Magazin;
USE Magazin;

CREATE TABLE clienti (
idClient INTEGER PRIMARY KEY NOT NULL ,
Nume TEXT,
Prenume TEXT);

 CREATE TABLE Produse (
 idClient INTEGER NOT NULL,
 idProdus INTEGER PRIMARY KEY NOT NULL,
 NumeProdus TEXT,
 PretProdus INTEGER,
 FOREIGN KEY(idClient) REFERENCES clienti(idClient)
 );

INSERT INTO clienti VALUES (1, "Nechita", "Robert");
INSERT INTO clienti VALUES (2, "Gica", "Hagi");
INSERT INTO clienti VALUES (3, "Florea", "Ionut");

INSERT INTO Produse VALUES ( 1, 365, "Banane", 20);
INSERT INTO Produse VALUES ( 2, 2, "Mere", 5);
INSERT INTO Produse VALUES ( 3, 4, "Pere", 15);