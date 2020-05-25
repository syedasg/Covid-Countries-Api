package com.covid.covidcountriesnamesapi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.covidcountriesnamesapi.beans.CountriesNames;
import com.covid.covidcountriesnamesapi.beans.CountryInfo;
import com.covid.covidcountriesnamesapi.service.CountriesDetailsService;

@RestController
public class CountryController {
	@Autowired
	CountriesDetailsService countriesDetailsService;
	@GetMapping("/countries")
	public List<CountryInfo> getCountriesNames() throws IOException, InterruptedException
	{
		return countriesDetailsService.fetchVirusData();
		
	}
	
	
}
