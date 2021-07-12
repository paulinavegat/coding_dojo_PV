package com.paulina.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paulina.relationships.models.License;
import com.paulina.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
   private final LicenseRepository licenseRepository;

   public LicenseService(LicenseRepository licenseRepository) {
	this.licenseRepository = licenseRepository;
    }
   
   public List<License> allLicenses() {
	   return licenseRepository.findAll();
   }
   
   private static String numLicense ="000001";
   public void createLicense(License license) {
	   license.setNumber(numLicense);
	    numLicense=String.format("%06d", Integer.parseInt(numLicense)+1);
		licenseRepository.save(license);
   }
  
   public void deleteLicense(Long id) {
	   licenseRepository.deleteById(id);
   }
}
