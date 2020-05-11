package com.covid.covidcountriesnamesapi.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountriesNames {
	@JsonProperty("")
	List<CountryInfo> countryList;

	@Override
	public String toString() {
		return "CountriesNames [countryList=" + countryList + "]";
	}

	public List<CountryInfo> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<CountryInfo> countryList) {
		this.countryList = countryList;
	}
	
}
