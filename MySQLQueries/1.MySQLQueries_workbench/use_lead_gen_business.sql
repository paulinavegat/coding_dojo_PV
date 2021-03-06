use lead_gen_business;
-- seleccionar todo desde la tabla lead (interesados del servicio)
SELECT * FROM sites;

-- seleccionar nombre, apellido e email desde la tabla leads
SELECT id, first_name, last_name, email FROM leads;

-- seleccionar de la tabla clientes donde el primer nombre comience con j
SELECT * FROM clients WHERE first_name LIKE "j%";

-- insertar en la tabla leads el nuevo registro con nombre, apellido, en la fecha de hoy y asociados 
-- a un determinado sites_id
INSERT INTO leads (first_name, last_name, registered_datetime, email, sites_id)
VALUES('Paulina', 'Vega', NOW(), 'paulinavegat@gmail.com', 1);

SELECT * FROM leads;

-- actualizar la tabla leads, la columna first name y last name por 
UPDATE leads SET first_name = 'Hola', last_name='Chao' WHERE sites_id = '1';
SELECT * FROM leads;

SELECT CONCAT('Mr./ Mrs.',  ' ', first_name, ' ', last_name) AS full_name FROM leads;

DELETE FROM leads WHERE id = 37;