package com.paulina.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.lookify.models.Song;

public interface SongRepository extends CrudRepository <Song, Long> {
	List<Song> findAll();
	
	List<Song> findByArtist(String artist);
	
	List<Song> findAllByOrderByRatingDesc();

}