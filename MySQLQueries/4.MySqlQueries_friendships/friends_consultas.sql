SELECT * from USERS;
SELECT * FROM friendships;

-- Usando el siguiente ERD como referencia, escribe una consulta SQL
-- que devuelva una lista de usuarios junto con los nombres de sus amigos.
SELECT users.first_name, users.last_name, users2.first_name as nombre_bestie, users2.last_name as apellido_bestie, friendships.friend_id
FROM users 
JOIN friendships ON users.id = friendships.user_id
JOIN USERS AS users2 ON users2.id = friendships.friend_id;

-- 1. Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados.
SELECT users2.first_name, users2.last_name,  users.first_name as nombre_bestie, users.last_name as apellido_bestie
FROM users 
JOIN friendships ON users.id = friendships.user_id
JOIN users AS users2 ON users2.id = friendships.friend_id
WHERE user_id = 4 OR friend_id = 4;

-- 2. Devuelve el recuento de todas las amistades.
SELECT COUNT(friendships.friend_id) AS amount_of_friendships
FROM friendships;

-- 3. Descubre quién tiene más amigos y devuelve el recuento de sus amigos.
SELECT users.first_name, users.last_name, COUNT(friendships.friend_id) as amount_of_friendships
FROM users 
JOIN friendships ON users.id = friendships.user_id
JOIN USERS AS users2 ON users2.id = friendships.friend_id
GROUP BY users.id;

-- 4. Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.
INSERT INTO users (first_name, last_name, created_at)
VALUES ('Juanito', 'Perez', NOW());

  -- segundo query, hacer que este nuevo usuario tenga amigos (id de los usurios)--
INSERT INTO friendships(user_id, friend_id, created_at)
VALUES ('6', '2', NOW()), ('6', '4', NOW()), ('6', '5', NOW());

-- 5. Devuelve a los amigos de Eli en orden alfabético.
SELECT users2.first_name, users2.last_name,  users.first_name as nombre_bestie, users.last_name as apellido_bestie
FROM users 
JOIN friendships ON users.id = friendships.user_id
JOIN USERS AS users2 ON users2.id = friendships.friend_id
WHERE user_id = 2 OR friend_id = 2
ORDER BY users2.first_name;

-- 6. Eliminar a Marky Mark de los amigos de Eli.
DELETE FROM friendships 
WHERE user_id = '2'AND friend_id = '5';

-- chequear
SELECT users.first_name, users.last_name, users2.first_name as nombre_bestie, users2.last_name as apellido_bestie, friendships.friend_id
FROM users 
JOIN friendships ON users.id = friendships.user_id
JOIN USERS AS users2 ON users2.id = friendships.friend_id;

-- 7. Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos
SELECT users.first_name, users.last_name, users2.first_name as nombre_bestie, users2.last_name as apellido_bestie
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users AS users2 ON friendships.friend_id = users2.id;


