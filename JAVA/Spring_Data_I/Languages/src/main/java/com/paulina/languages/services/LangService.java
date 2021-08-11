package com.paulina.languages.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.languages.models.Language;
import com.paulina.languages.repositories.LangRepository;




@Service
public class LangService {

	private final LangRepository langRepository;
	
	public LangService(LangRepository langRepository) {
		this.langRepository = langRepository;
	}
	
	public List<Language> allLangs() {
		return langRepository.findAll();
	}
	
	public Language createLang(Language lang) {
		return langRepository.save(lang);
	}
	
	public Language updateLang(Language lang) {
		return langRepository.save(lang);
	}
	
	public Language findLang(Long id) {
		Optional<Language> optionalLang = langRepository.findById(id);
		if (optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	
	public void deleteLang(Long id) {
		langRepository.deleteById(id);
	}
}