package com.paulina.pagDojoNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.paulina.pagDojoNinjas.models.Ninja;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long> {
	List<Ninja> findAll();
}

