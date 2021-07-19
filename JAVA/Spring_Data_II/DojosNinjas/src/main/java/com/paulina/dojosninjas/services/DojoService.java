package com.paulina.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.dojosninjas.models.Dojo;
import com.paulina.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}

	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}

	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
		
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
		
	}

	public Dojo findDojo(Long id) {
		 Optional<Dojo> optionalDojo= dojoRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
		return null;
	        }
	}
	public void deleteDojo (Dojo dojo) {
		dojoRepository.deleteById(dojo.getId());
	}
}


