package com.paulina.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paulina.languages.models.Language;



@Repository
public interface LangRepository extends CrudRepository<Language, Long> {
    //este metodo recupera todos los idiomas desde la base de datos
    public List<Language> findAll();
}
