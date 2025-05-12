INSERT INTO raza (id,nombre) VALUES (1,'Limusina');
INSERT INTO raza (id,nombre) VALUES (2,'Charolesa');
INSERT INTO raza (id,nombre) VALUES (3,'Retinta');
INSERT INTO raza (id,nombre) VALUES (4,'Raza por defecto');
ALTER TABLE raza ALTER COLUMN id RESTART WITH 5;

INSERT INTO vaca (id, peso, num_identificacion, fecha_nacimiento, fecha_parto, raza_id) VALUES (1, 650.4, 1001, '2020-05-15', '2023-11-10', 1);
ALTER TABLE vaca ALTER COLUMN id RESTART WITH 2;