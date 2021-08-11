package com.paulina.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.paulina.lookify.models.Song;
import com.paulina.lookify.services.SongService;



@Controller
public class SongController {
    	private final SongService songService;
    	
    	public SongController (SongService songService) {
    		this.songService = songService;
    	}
    	
    	@RequestMapping("/")
    	public String index() {
    		return "/songs/index.jsp";
    	}
    	
    	@RequestMapping("/dashboard")
    	public String dashboard(@ModelAttribute("song") Song song, Model model) {
    		List<Song> songs = songService.allSongs();
    		model.addAttribute("songs", songs);
    		return "/songs/dashboard.jsp";
    	}
    	
    	@RequestMapping("/new")
    	public String showNew(@ModelAttribute("song") Song song) {
    		return "/songs/new.jsp"; 
    	}
    		
    	@RequestMapping(value="/new", method=RequestMethod.POST)
    	public String newSong (@Valid @ModelAttribute("song") Song song, BindingResult result) {
    		if (result.hasErrors()) {
    			return "/songs/new.jsp";
    		} else {
    			songService.createSong(song);
    			return "redirect:/dashboard";
    		}
    	}
    	
    	@PostMapping("/search")
    	public String search(@RequestParam("artist") String artist) {
    		return "redirect:/search/"+artist;
    		
    	}
    	
    	@RequestMapping("search/{artist}")
    	public String showSearch(Model model, @PathVariable("artist") String artist) {
    		List<Song> songs = songService.searchByArtist(artist);
    		model.addAttribute("artist", artist);
    		model.addAttribute("songs", songs);
    		return "/songs/search.jsp";
    	}
    	
    	@RequestMapping("songs/{id}")
    	public String showSong (@PathVariable("id")Long id, Model model) {
    		Song song = songService.findSong(id);
    		model.addAttribute("song", song);
    		return "/songs/details.jsp";
    	}
    	
    	@RequestMapping("search/songs/{id}")
    	public String searchSong (@PathVariable("id")Long id, Model model) {
    		Song song = songService.findSong(id);
    		model.addAttribute("song", song);
    		return "/songs/details.jsp";
    	}
    	
    	@RequestMapping(value="songs/delete/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
    	        songService.deleteSong(id);
		return "redirect:/dashboard";
	}
    	   	
    	@RequestMapping("search/topTen")
    	public String showTopSongs(@ModelAttribute("song") Song song,Model model) {
    		List<Song> songs = songService.showTopTen();
    		model.addAttribute("songs", songs);
    		return "/songs/topTen.jsp";
    	}
    }
