package com.paulina.dojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.dojoOverflow.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	List<Tag> findAll();
}
