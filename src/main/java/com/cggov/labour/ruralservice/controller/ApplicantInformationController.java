package com.cggov.labour.ruralservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cggov.labour.ruralservice.api.model.ApplicantInformation;
import com.cggov.labour.ruralservice.datamodel.ApplicantInformationData;
import com.cggov.labour.ruralservice.service.ApplicantInformationService;

@RestController
public class ApplicantInformationController {
	
	
	@Autowired
	ApplicantInformationService applicantInformationService;

	
	@GetMapping(value = "/applicantinformation", params="name" )
	ApplicantInformation getApplicantInformation(@RequestParam String name) {  // GET http://localhost:8080/applicantinformation?name=abc
		
		
		ApplicantInformation applicantInfo = new ApplicantInformation(1, name);
		
		
		return applicantInfo;
		
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	*/
	@GetMapping(value = "/applicantinformation/{applicantId}" )
	ResponseEntity<ApplicantInformation> getApplicantInformationById(@PathVariable long applicantId) {
		
		
		try {
			ApplicantInformation applicantInformation = applicantInformationService.getApplicantInformationById(applicantId);
			
			
			return new ResponseEntity<>(applicantInformation, HttpStatus.CREATED);
		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	/**
	 * method -> name: createApplicantInformation
	 * 		     paramater : ApplicantInformation applicantInfo (Class ref) // var data = {abc , hhh }
	 * 			 return :  	ResponseEntity<ApplicantInformation> 
	 * 
	 * // POST http://localhost:8080/applicantinformation
	 * RequestBody
	 * {
	 *    
	 *    "name": "abc"
	 * 
	 * }
	 * */
	@PostMapping(value = "/applicantinformation", consumes = "application/json", produces = "application/json")    
	ResponseEntity<ApplicantInformation> createApplicantInformation(@RequestBody ApplicantInformation applicantInfo) {
		
		
		try {
			ApplicantInformation applicantInformation = applicantInformationService.createApplicantInformation(applicantInfo);
			
			return new ResponseEntity<>(applicantInformation, HttpStatus.CREATED);
			
		} catch (Exception e) {

			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


}
