package com.paulina.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paulina.countries.repositories.CityRepository;
import com.paulina.countries.repositories.CountryRepository;
//import com.paulina.countries.repositories.LanguageRepository;
import com.paulina.models.City;



@Service
public class ApiService {

	private CityRepository cityRepository;
	private CountryRepository countryRepository;
	//private LanguageRepository languageRepository;
	
	// 1. ¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno? Su consulta debe retornar el nombre del país, lenguaje y porcentaje del lenguaje. Su consulta debe organizar los resultados por porcentaje en orden descendente.
	public List<Object[]> findCountriesByLanguage(String string) {
		return countryRepository.findCountriesByLanguageDesc(string);
	}

	//2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país? Su consulta debe retornar el nombre del país y el número total de ciudades. Su consulta debe organizar los resultados por número de ciudades en orden descendente.
	public List<Object[]> findTotalCities() {
		return countryRepository.findCountriesWithNumCities();
	}

	//3.¿Qué consulta ejecutarías para obtener todas las ciudades en México con una población mayor a 500.000? Su consulta debe organizar los resultados por población en orden descendente.
	public List<City> findCitiesInCountryWithPopulationGreaterThan(String country, Integer population){
		return cityRepository.findCitiesInCountryWithPopulationGreaterThan(country, population);
	}
	// 4.¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%? Su consulta debe organizar los resultados por porcentaje en orden descendente.

	public List<Object[]> findLanguagesWithPercentageGreaterThan(double d) {
		return countryRepository.findLanguagesWithPercentageGreaterThan(d);
	}

	// 5.¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 y una población mayor a 100.000?

	public List<Object[]> SBelowPopGreater(Double i, Integer j) {
		return countryRepository.findSBelowPopGreater(i, j);
	}
	//6 ¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) y una superficie de área mayor a 200 y una expectativa de vida superior a los 75 años?
	public List<Object[]> govSaLe(String gov, Double sA, Double lE){
		return countryRepository.findGovSaLe(gov, sA, lE);
	}
	// 7. ¿Qué consulta ejecutarías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y que tengan una población mayor a 500.000? La consulta debe retornar el nombre del país, nombre de la ciudad, distrito y población.
	public List<Object[]> findNumSev(String cName, String dName, Integer pop){
		return countryRepository.findCoCiDiPop(cName, dName, pop);
	}
	// 8.¿Qué consulta ejecutarías para sumar el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países. Además, la consulta debe organizar los resultados por el número de países en orden descendente.
	public List<Object[]> findEachRegion(){
		return countryRepository.findNumberOfCountriesInEachRegion();
	}

}