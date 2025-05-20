INSERT INTO raza (id,nombre) VALUES (1,'Limusina');
INSERT INTO raza (id,nombre) VALUES (2,'Charolesa');
INSERT INTO raza (id,nombre) VALUES (3,'Retinta');
INSERT INTO raza (id,nombre) VALUES (4,'Raza sin definir');
INSERT INTO raza (id, nombre) VALUES (5, 'Avileña-Negra Ibérica');
INSERT INTO raza (id, nombre) VALUES (6, 'Morucha');
INSERT INTO raza (id, nombre) VALUES (7, 'Rubia Gallega');
INSERT INTO raza (id, nombre) VALUES (8, 'Asturiana de los Valles');
INSERT INTO raza (id, nombre) VALUES (9, 'Asturiana de la Montaña');
INSERT INTO raza (id, nombre) VALUES (10, 'Retinta Extremeña');
INSERT INTO raza (id, nombre) VALUES (11, 'Tudanca');
INSERT INTO raza (id, nombre) VALUES (12, 'Sayaguesa');
INSERT INTO raza (id, nombre) VALUES (13, 'Alistana-Sanabresa');
INSERT INTO raza (id, nombre) VALUES (14, 'Pirenaica');


ALTER TABLE raza ALTER COLUMN id RESTART WITH 15;

INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (1, 650.4, 1001, '2020-05-15', '2023-11-10', 1, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (2, 700.0, 1002, '2019-03-20', '2023-11-10', 2, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (3, 720.5, 1003, '2018-07-25', '2023-11-10', 3, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (4, 680.2, 1004, '2017-11-30', '2023-11-10', 4, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (5, 750.0, 1005, '2016-02-15', '2023-11-10', 5, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (6, 720.0, 1006, '2015-08-10', '2023-11-10', 6, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (7, 680.0, 1007, '2014-12-05', '2023-11-10', 7, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (8, 700.0, 1008, '2013-06-15', '2023-11-10', 8, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (9, 690.0, 1009, '2012-04-20', '2023-11-10', 9, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (10, 710.0, 1010, '2011-09-30', '2023-11-10', 10, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (11, 730.0, 1011, '2010-01-15', '2023-11-10', 11, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (12, 740.0, 1012, '2009-03-25', '2023-11-10', 12, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (13, 750.0, 1013, '2008-07-10', '2023-11-10', 13, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (14, 760.0, 1014, '2007-11-20', '2023-11-10', 14, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (15, 770.0, 1015, '2006-05-30', '2023-11-10', 1, false, 0.0);

ALTER TABLE vaca ALTER COLUMN id RESTART WITH 16;