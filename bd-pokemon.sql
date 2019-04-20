CREATE DATABASE pokemon;
SHOW DATABASES;
USE pokemon;
CREATE TABLE pokemonagua(
idPokemon INT NOT NULL AUTO_INCREMENT,
idDexNacional INT NOT NULL,
nombrePokemon VARCHAR(16) NOT NULL,
tipoPokemon VARCHAR(10) DEFAULT 'AGUA',
pesoPokemon DOUBLE NOT NULL,
alturaPokemon DOUBLE NOT NULL,
PRIMARY KEY(idPokemon));
SELECT * FROM pokemonagua;
DESCRIBE pokemonagua;
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',7,'Squirtle',9.0,0.51);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',8,'Wartortle',22.5,0.99);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',9,'Blastoise',85.5,1.60);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',54,'Psyduck',19.6,0.79);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',55,'Golduck',76.6,1.70);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',60,'Poliwag',12.4,0.61);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',61,'Poliwhirl',20.0,0.99);
INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon)VALUES('0',62,'Poliwrath',54.0,1.30);
INSERT INTO pokemonagua VALUES('0',72,'Tentacool',default,45.5,0.89);
INSERT INTO pokemonagua VALUES('0',73,'Tentacruel',default,55.0,1.60);
INSERT INTO pokemonagua VALUES('0',79,'Slowpoke',default, 36.0,1.19);
INSERT INTO pokemonagua VALUES('0',80,'Slowbro',default,78.5,1.60);
INSERT INTO pokemonagua VALUES('0',86,'Seel',default,90.0,1.09);
INSERT INTO pokemonagua VALUES('0',87,'Dewgong',default,120.0,1.70);
INSERT INTO pokemonagua VALUES('0',86,'Shellder',default,4.0,0.30);
INSERT INTO pokemonagua VALUES('0',87,'Cloyster',default,132.5,1.50);
INSERT INTO pokemonagua VALUES('0',98,'Krabby',default,6.5,0.41);
INSERT INTO pokemonagua VALUES('0',99,'Kingler',default,60.0,1.30);
INSERT INTO pokemonagua VALUES('0',116,'Horsea',default,0.8,0.41);
INSERT INTO pokemonagua VALUES('0',117,'Seadra',default,25.0,1.19);
INSERT INTO pokemonagua VALUES('0',118,'Goldeen',default,15.0,0.61);
INSERT INTO pokemonagua VALUES('0',119,'Seaking',default,39.0,1.30);
INSERT INTO pokemonagua VALUES('0',120,'Staryu',default,34.5,0.79);
INSERT INTO pokemonagua VALUES('0',121,'Starmie',default,80.0,1.09);
INSERT INTO pokemonagua VALUES('0',129,'Magikarp',default,10.0,0.89);
INSERT INTO pokemonagua VALUES('0',130,'Gyarados',default,235.0,6.5);
INSERT INTO pokemonagua VALUES('0',131,'Lapras',default,220.0,2.49);
INSERT INTO pokemonagua VALUES('0',134,'Vaporeon',default,29.0,0.99);
INSERT INTO pokemonagua VALUES('0',138,'Omanyte',default,7.5,0.41);
INSERT INTO pokemonagua VALUES('0',139,'Omastar',default,35.0,0.99);
INSERT INTO pokemonagua VALUES('0',140,'Kabuto',default,11.5,0.51);
INSERT INTO pokemonagua VALUES('0',141,'Kabutops',default,40.5,1.30);
SELECT * FROM pokemonagua;
UPDATE pokemonagua SET pesoPokemon=6.66 AND alturaPokemon=7.77 WHERE idDexNacional=134;