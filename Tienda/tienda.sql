create database tienda

CREATE TABLE producto (
  id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
  codigo varchar(20) NOT NULL,
  nombre varchar(50) NOT NULL,
  precio decimal(10,2) NOT NULL,
  cantidad int NOT NULL
) ;

INSERT INTO producto 
(codigo, nombre, precio, cantidad) VALUES
('005', 'Papas', '8.50', 19),
('006', 'refresco', '10.00', 10),
('001', 'Pastelito', '9.00', 2),
('002', 'Cacahuates', '8.50', 20),
('003', 'Pepitas', '4.50', 10);

select * from producto 