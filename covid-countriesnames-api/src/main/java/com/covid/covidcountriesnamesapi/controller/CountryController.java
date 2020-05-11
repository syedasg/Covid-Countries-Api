package com.covid.covidcountriesnamesapi.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.covidcountriesnamesapi.beans.CountriesNames;
import com.covid.covidcountriesnamesapi.service.CountriesDetailsService;

@RestController
public class CountryController {
	CountriesDetailsService countriesDetailsService;
	@GetMapping("/countries")
	public CountriesNames getCountriesNames() throws IOException, InterruptedException
	{
		return countriesDetailsService.fetchVirusData();
		
	}
	
	
}
