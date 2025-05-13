INSERT INTO raza (id,nombre) VALUES (1,'Limusina');
INSERT INTO raza (id,nombre) VALUES (2,'Charolesa');
INSERT INTO raza (id,nombre) VALUES (3,'Retinta');
INSERT INTO raza (id,nombre) VALUES (4,'Raza por defecto');
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

INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (1, 650.4, 1001, '2020-05-15', '2023-11-10', 1);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (2, 670.2, 1002, '2019-03-10', '2022-09-01', 2);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (3, 610.5, 1003, '2021-07-22', '2024-02-15', 1);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (4, 645.0, 1004, '2020-12-05', '2023-08-30', 3);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (5, 700.0, 1005, '2018-11-20', '2022-05-15', 4);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (6, 680.3, 1006, '2019-01-30', '2022-07-20', 5);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (7, 720.1, 1007, '2018-08-15', '2022-12-10', 6);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (8, 690.4, 1008, '2020-04-25', '2023-11-05', 7);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (9, 710.2, 1009, '2019-06-18', '2022-10-12', 8);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (10, 675.5, 1010, '2021-02-14', '2024-01-20', 9);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (11, 640.0, 1011, '2020-09-30', '2023-06-25', 10);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (12, 660.7, 1012, '2018-05-05', '2022-11-15', 11);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (13, 630.8, 1013, '2019-12-12', '2023-03-20', 12);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (14, 700.9, 1014, '2020-03-28', '2023-07-18', 13);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (15, 680.6, 1015, '2018-10-10', '2022-08-05', 14);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (16, 710.3, 1016, '2019-11-15', '2022-12-30', 1);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (17, 690.1, 1017, '2020-06-20', '2023-10-01', 2);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (18, 675.4, 1018, '2018-04-10', '2022-09-15', 3);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (19, 640.2, 1019, '2019-08-25', '2023-01-05', 4);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (20, 680.8, 1020, '2020-02-14', '2023-05-10', 5);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (21, 700.4, 1021, '2018-07-30', '2022-11-20', 6);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (22, 720.0, 1022, '2019-03-05', '2023-12-15', 7);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (23, 690.5, 1023, '2020-01-18', '2023-08-25', 8);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (24, 675.7, 1024, '2018-11-22', '2022-10-30', 9);
INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (25, 640.9, 1025, '2019-05-15', '2023-02-20', 10);

ALTER TABLE vaca ALTER COLUMN id RESTART WITH 26;