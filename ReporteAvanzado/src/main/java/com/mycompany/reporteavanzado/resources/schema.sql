DROP DATABASE IF EXISTS ventas_empresa;
CREATE DATABASE ventas_empresa;
USE ventas_empresa;

CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    precio_unitario DECIMAL(10, 2) NOT NULL
);

CREATE TABLE ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT NOT NULL,
    fecha_venta DATE NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

INSERT INTO productos (nombre, categoria, precio_unitario) VALUES 
('Portátil Lenovo ThinkPad', 'Electrónica', 850.00),
('Ratón Inalámbrico Logitech', 'Electrónica', 25.50),
('Monitor Dell 24"', 'Electrónica', 180.00),
('Silla Ergonómica Office', 'Mobiliario', 120.00),
('Mesa de Escritorio Blanca', 'Mobiliario', 95.00),
('Lámpara LED Flexo', 'Mobiliario', 35.00),
('Paquete Folios A4 (500)', 'Papelería', 4.50),
('Caja Bolígrafos Azules', 'Papelería', 6.20);

INSERT INTO ventas (id_producto, fecha_venta, cantidad) VALUES 
(1, '2023-10-01', 2),  -- 2 Portátiles
(4, '2023-10-01', 1),  -- 1 Silla
(7, '2023-10-02', 10), -- 10 Paquetes folios
(2, '2023-10-03', 5),  -- 5 Ratones
(3, '2023-10-04', 2),  -- 2 Monitores
(8, '2023-10-05', 3),  -- 3 Cajas bolis
(1, '2023-10-06', 1),  -- 1 Portátil
(5, '2023-10-07', 2),  -- 2 Mesas
(6, '2023-10-08', 4),  -- 4 Lámparas
(7, '2023-10-09', 20), -- 20 Paquetes folios
(4, '2023-10-10', 2),  -- 2 Sillas
(2, '2023-10-11', 1),  -- 1 Ratón
(3, '2023-10-12', 1),  -- 1 Monitor
(8, '2023-10-13', 5),  -- 5 Cajas bolis
(5, '2023-10-14', 1),  -- 1 Mesa
(1, '2023-10-15', 3),  -- 3 Portátiles (Venta grande)
(6, '2023-10-16', 2),  -- 2 Lámparas
(7, '2023-10-17', 5),  -- 5 Paquetes folios
(2, '2023-10-18', 3),  -- 3 Ratones
(4, '2023-10-19', 1),  -- 1 Silla
(3, '2023-10-20', 3);  -- 3 Monitores