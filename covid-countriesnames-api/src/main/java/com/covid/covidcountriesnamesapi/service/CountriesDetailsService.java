package com.covid.covidcountriesnamesapi.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.covid.covidcountriesnamesapi.beans.CountriesNames;
import com.covid.covidcountriesnamesapi.beans.CountryInfo;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CountriesDetailsService {
	private static final String COUNTRY_WISE_DATA_API_URL= "https://api.covid19api.com/countries";
	
	//@PostConstruct
	public  CountriesNames fetchVirusData() throws IOException, InterruptedException {
        //HttpClient client = HttpClientBuilder.create().build();
        //HttpResponse response = client.execute(new HttpGet(SAMPLE_URL));
		
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(COUNTRY_WISE_DATA_API_URL))
                .build();

        HttpResponse<String> httpResponse = client.send(request, BodyHandlers.ofString());
       // System.out.println(httpResponse.statusCode());
       // System.out.println(httpResponse.body());

        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
       CountriesNames countrynames = objectMapper.readValue(httpResponse.body(), CountriesNames.class);
        
        System.out.println(countrynames);
        
       if (countrynames!=null)
        return countrynames;
        
        else 
        	return new CountriesNames();

    }
}
