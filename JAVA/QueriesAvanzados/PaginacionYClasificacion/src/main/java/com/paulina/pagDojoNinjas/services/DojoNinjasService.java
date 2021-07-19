package com.paulina.pagDojoNinjas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.paulina.pagDojoNinjas.models.Dojo;
import com.paulina.pagDojoNinjas.models.Ninja;
import com.paulina.pagDojoNinjas.repositories.DojoRepository;
import com.paulina.pagDojoNinjas.repositories.NinjaRepository;


@Service
@Transactional
public class DojoNinjasService {
	
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	private static final int PAGE_SIZE = 3;
	
	public DojoNinjasService (DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
    public Page<Ninja> ninjasPerPage(int pageNumber) {
        PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "firstName");
        return ninjaRepository.findAll(pageRequest);
    }
    
    public Page<Object[]> sortedDojos(int number) {
    	PageRequest request = PageRequest.of(number, PAGE_SIZE, Sort.Direction.ASC, "name");
        return dojoRepository.joinDojosAndNinjas2(request);
    }
	
	public List<Object[]> dojoNinjas() {
		return dojoRepository.joinDojosAndNinjas();
	}
}