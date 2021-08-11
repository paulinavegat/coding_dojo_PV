package com.paulina.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.lookify.models.Song;
import com.paulina.lookify.repositories.SongRepository;

    @Service
    public class SongService {
    	private final SongRepository songRepository;
    	
    	public SongService(SongRepository songRepository) {
    		this.songRepository = songRepository;
    	}
    	public List<Song> allSongs() {
    		return songRepository.findAll();
    	}
    	public Song createSong(Song s) {
    		return songRepository.save(s);
    	}
    	public Song findSong(Long id) {
    		Optional<Song> optionalSong = songRepository.findById(id);
    		if (optionalSong.isPresent()) {
    			return optionalSong.get();
    		} else {
    			return null;
    		}
    	}
    	public List<Song>findArtist(String artist){
    	    return songRepository.findByArtist(artist);
    	}
    	
    	public void updateSong(Song song) {
    	    	songRepository.save(song);
    	}
    	public void deleteSong(Long id) {
    	    	songRepository.deleteById(id);
    	}
    	public List<Song> searchByArtist(String artist) {
    		return songRepository.findByArtist(artist);
    	}
    	public List<Song> showTopTen() {
    		return songRepository.findAllByOrderByRatingDesc();
    
    	}
    }
    	
    	
    	
    


