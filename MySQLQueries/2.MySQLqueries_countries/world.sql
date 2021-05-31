-- Consultas
-- 1. ¿Qué consulta harías para obtener todos los países que hablan esloveno?
--  Tu consulta debe devolver el nombre del país, el idioma y el porcentaje de idioma. 
-- Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. (1)
SELECT countries.name, languages.language, languages.percentage 
FROM  countries 
JOIN languages ON countries.code = languages.country_code
WHERE language = 'Slovene'
ORDER by percentage DESC;

-- 2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? 
-- Su consulta debe devolver el nombre del país y el número total de ciudades. 
-- Tu consulta debe organizar el resultado por el número de ciudades en orden descendente. (3)
SELECT countries.name, COUNT(cities.id) 
FROM countries
JOIN cities ON countries.code = cities.country_code
GROUP BY countries.code
ORDER BY COUNT(cities.id) DESC;

-- 3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000?
-- Tu consulta debe organizar el resultado por población en orden descendente. (1)

-- *para conocer el codigo de mexico primero hice esta consulta en la DB
select countries.name, countries.code
From countries;

-- luego que obtuve que mexico tiene MEX como code puedo hacer la siguiente consulta
SELECT cities.name, cities.population
FROM cities
JOIN countries ON cities.country_id = countries.id
WHERE countries.code = 'MEX'AND cities.population > '500000'  
ORDER BY population DESC;

-- 4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje superior al 89%? 
-- Tu consulta debe organizar el resultado por porcentaje en orden descendente. (1)
SELECT countries.name, languages.language, languages.percentage
FROM countries
JOIN languages ON countries.code = languages.country_code
WHERE languages.percentage > '89%'
ORDER BY percentage DESC; -- optional

-- 5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 501 y una población superior a 100,000? (2)
SELECT countries.name, countries.surface_area, countries.population
FROM countries
WHERE surface_area < '501' AND population > '100000'  
ORDER BY population DESC; -- optional
    
-- 6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200
-- y una esperanza de vida superior a 75 años? (1)

-- Primero consulte la DB para conocer la forma que ha sido escrita "Monarquía Constitucional", descartar opcion de abreviaciones y codigos
SELECT countries.name, countries.government_form
FROM countries; 

-- luego que obtuve que la forma de gob a consultar deberia ser Constitutional Monarchy
SELECT countries.name, countries.government_form, countries.capital, countries.life_expectancy
FROM countries
WHERE government_form = 'Constitutional Monarchy' AND capital > '200' AND life_expectancy > '75' 
ORDER BY capital DESC; -- optional

-- 7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y tener una población superior a 500,000?
--  La consulta debe devolver el nombre del país, el nombre de la ciudad, el distrito y la población. (2)

-- *para conocer el codigo de Argentina primero hice esta consulta en la DB
SELECT countries.name, countries.code
FROM countries;

-- luego que obtuve que ARGENTINA tiene ARG como code puedo hacer la siguiente consulta
SELECT countries.name AS country, cities.name AS city, cities.district AS district, cities.population
FROM countries
JOIN cities ON countries.code = cities.country_code
WHERE countries.code = 'ARG' AND cities.district = 'Buenos Aires' AND cities.population > '500000'
ORDER BY population DESC; -- optional


-- 8. ¿Qué consulta harías para resumir(contar) el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países.
--  Además, la consulta debe organizar el resultado por el número de países en orden descendente. (2
-- puse opcional "countries.continent" para darle un poco de orden en los datos entregados y los agrupe por este mismo campo

SELECT countries.continent, countries.region, COUNT(countries.id) as number_of_countries
FROM world.countries
GROUP BY continent -- tambien se puede agrupar por region
ORDER BY COUNT(countries.id) DESC;