package com.covid.covidcountriesnamesapi.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryInfo {
        
	   @JsonProperty("Country")
	    String Country;
	   @JsonProperty("Slug")
	   String Slug; 
	   @JsonProperty("IS02")
	    String ISO2;
	@Override
	public String toString() {
		return "CountryInfo [Country=" + Country + ", Slug=" + Slug + ", ISO2=" + ISO2 + "]";
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getSlug() {
		return Slug;
	}
	public void setSlug(String slug) {
		Slug = slug;
	}
	public String getISO2() {
		return ISO2;
	}
	public void setISO2(String iSO2) {
		ISO2 = iSO2;
	}
}
