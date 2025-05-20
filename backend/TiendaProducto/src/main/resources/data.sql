-- Crear tabla productos si no existe (para SQL Server)
IF OBJECT_ID('productos', 'U') IS NULL
BEGIN
CREATE TABLE productos (
                           id INT IDENTITY(1,1) PRIMARY KEY,
                           nombre VARCHAR(255) NOT NULL,
                           descripcion VARCHAR(1000),
                           precio DECIMAL(10,2) NOT NULL,
                           vigente BIT NOT NULL
);
END
GO

-- Insertar datos
INSERT INTO productos (nombre, descripcion, precio, vigente)
VALUES
  ('Notebook Lenovo', 'Notebook Lenovo IdeaPad 15.6" con procesador Intel i5', 459999.99, 1),
  ('Mouse Logitech', 'Mouse inalámbrico Logitech M185', 7999.50, 1),
  ('Teclado Redragon', 'Teclado mecánico Redragon Kumara con retroiluminación RGB', 22999.00, 1),
  ('Monitor Samsung', 'Monitor Samsung 24" Full HD con panel IPS', 124999.90, 1),
  ('Silla Gamer', 'Silla ergonómica gamer con soporte lumbar', 149999.00, 1),
  ('Disco SSD 1TB', 'Disco sólido Kingston 1TB NVMe', 84999.75, 1),
  ('Memoria RAM 16GB', 'Memoria DDR4 16GB 3200MHz', 44999.40, 1),
  ('Auriculares JBL', 'Auriculares inalámbricos JBL Tune 510BT', 18999.90, 1),
  ('Webcam Logitech', 'Webcam Logitech C920 HD Pro', 37999.00, 1),
  ('Impresora HP', 'Impresora multifunción HP DeskJet 3775', 56999.99, 0);
