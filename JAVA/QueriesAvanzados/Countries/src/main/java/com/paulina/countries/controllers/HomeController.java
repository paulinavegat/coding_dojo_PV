package com.paulina.countries.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.countries.services.ApiService;
import com.paulina.models.City;

@Controller
public class HomeController {

	private ApiService apiService;

	@RequestMapping("/")
	public String index() {
		// 1. ¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno? Su consulta debe retornar el nombre del país, lenguaje y porcentaje del lenguaje. Su consulta debe organizar los resultados por porcentaje en orden descendente.
		List<Object[]> countries1 = apiService.findCountriesByLanguage("Slovene");
		for (Object[] row : countries1) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
		//2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país? Su consulta debe retornar el nombre del país y el número total de ciudades. Su consulta debe organizar los resultados por número de ciudades en orden descendente.
		List<Object[]> cities1 = apiService.findTotalCities();
		for (Object[] row : cities1) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
		// 3. ¿Qué consulta ejecutarías para obtener todas las ciudades en México con una población mayor a 500.000? Su consulta debe organizar los resultados por población en orden descendente.
		List<City> cities2 = apiService.findCitiesInCountryWithPopulationGreaterThan("Mexico", 500000);
		for(City c : cities2) {
			System.out.println(c.getName());
			System.out.println(c.getPopulation());
		}
		
		// 4.¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%? Su consulta debe organizar los resultados por porcentaje en orden descendente.
		List<Object[]> countries2 = apiService.findLanguagesWithPercentageGreaterThan(89.0);
		for(Object[] row : countries2) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
		
		// 5.¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 y una población mayor a 100.000?
		List<Object[]> countries3 = apiService.SBelowPopGreater(501.00, 100000);
		for(Object[] row : countries3) {
			System.out.println(row[0]);
		}
		
		// 6. ¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) y una superficie de área mayor a 200 y una expectativa de vida superior a los 75 años?
		List<Object[]> countries4 = apiService.govSaLe("Constitutional Monarchy", 200.00, 75.00);
		for(Object[] row : countries4) {
			System.out.println(row[0]);
		}
		
		// 7. ¿Qué consulta ejecutarías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y que tengan una población mayor a 500.000? La consulta debe retornar el nombre del país, nombre de la ciudad, distrito y población.
		List<Object[]> countries5 = apiService.findNumSev("Argentina", "Buenos Aires", 500000);
		for(Object[] row: countries5) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
			System.out.println(row[3]);
		}
		
		// 8.¿Qué consulta ejecutarías para sumar el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países. Además, la consulta debe organizar los resultados por el número de países en orden descendente.
		List<Object[]> countries6 = apiService.findEachRegion();
		for(Object[] row: countries6) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
		return "index.jsp";
	}

}