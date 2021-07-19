package com.paulina.dojoOverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.dojoOverflow.models.Tag;
import com.paulina.dojoOverflow.repositories.TagRepository;

@Service
public class TagService {
	private final TagRepository tagRepository;

	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public List<Tag> allTag() {
		return tagRepository.findAll();
	}
	public Tag createTag (String tag) {
		Tag qTag=new Tag();
		qTag.setSubject(tag);
		return tagRepository.save(qTag);
	}
	
	public void createTag(Tag tag) {
		tagRepository.save(tag);
	}
	public void updateTag(Tag tag) {
		tagRepository.save(tag);
	}
	public Tag findTag(Long id) {
		Optional<Tag> optionalTag = tagRepository.findById(id);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		}
		else {
			return null;
		}
	}
	
	public ArrayList<Tag> findAllTags(){
		return(ArrayList<Tag>) tagRepository.findAll();
	}

	public void deleteTag (Long id) {
		tagRepository.deleteById(id);
	}

	

	
}
