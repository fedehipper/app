CREATE TABLE provincias (
    id INT auto_increment primary key,
    nombre VARCHAR(30)
);

CREATE TABLE edificio (
    id INT auto_increment PRIMARY KEY,
    nombre VARCHAR(50)
);

CREATE TABLE departamento (
    id int auto_increment PRIMARY KEY,
    numero VARCHAR(10),
    edificio_id INT,
    FOREIGN KEY (edificio_id) REFERENCES edificio(id)
);