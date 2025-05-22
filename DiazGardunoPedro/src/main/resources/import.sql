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
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (2, 700.0, 1002, '2019-03-20', '2022-09-15', 2, true, 1200.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (3, 680.5, 1003, '2021-01-10', '2023-12-01', 3, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (5, 690.0, 1005, '2020-11-05', '2023-08-20', 5, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (6, 710.8, 1006, '2019-06-18', '2022-12-12', 6, true, 1280.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (7, 675.3, 1007, '2021-02-22', '2023-11-05', 7, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (8, 730.0, 1008, '2018-09-30', '2021-11-15', 8, true, 1400.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (9, 695.5, 1009, '2020-04-12', '2023-10-25', 9, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (10, 720.0, 1010, '2019-08-05', '2022-07-30', 10, true, 1300.6);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (11, 680.0, 1011, '2021-03-15', '2023-09-20', 11, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (12, 710.5, 1012, '2018-12-01', '2021-08-10', 12, true, 1250.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (13, 695.0, 1013, '2020-06-20', '2023-11-01', 13, false, 0.0);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id, vendida, precio_venta) VALUES (14, 740.0, 1014, '2019-02-15', '2022-10-05', 14, true, 1450.0);


ALTER TABLE vaca ALTER COLUMN id RESTART WITH 15;