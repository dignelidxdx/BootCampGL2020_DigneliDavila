-- Ejercicio 1.1: Setup ambiente mysql con usuario para el ejercicios de lectura de base.
CREATE SCHEMA `Animals` ;

CREATE TABLE `Animals`.`animal` (
  `animal_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `specie` VARCHAR(45) NOT NULL,
  `peso` INT NOT NULL,
  PRIMARY KEY (`animal_id`));

-- Ejercicio 1.2: Generar la consulta para obtener animales ordenados por su id de forma descendente.
SELECT * from Animals.animal ORDER BY anima_id DESC;

-- Ejercicio 1.3: Generar la consulta para obtener animales ordenados por su id de forma ascendente y que pesen más de 30 Kg.
SELECT * from Animals.animal WHERE peso > 30 ORDER BY anima_id ASC;

-- Ejercicio 1.4: Generar la consulta para obtener animales ordenados por su id de forma ascendente y cuyo nombre comience con L.
SELECT * from Animals.animal WHERE name LIKE 'L%' ORDER BY anima_id ASC;

-- Ejercicio 1.5: Generar la consulta para obtener animales ordenados por su id de forma descendente y agrupados por su especie.
SELECT * from Animals.animal GROUP BY especie ORDER BY anima_id DESC;

-- Ejercicio 1.6: Generar la consulta para obtener los animales cuyo máximo peso sea mayor a 100 ordenados por su id de forma ascendente y agrupados por su especie.
SELECT * from Animals.animal WHERE peso > 100 GROUP BY especie ORDER BY anima_id DESC;
