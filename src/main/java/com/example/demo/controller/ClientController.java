package com.example.demo.controller;

import java.net.URI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientController {
		
	RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/actuator/customEndpoint/";
	String getStatus = "getStatus";
	String cambio = "cambio";
	String otroCambio = "otroCambio";
	
	public String getStatus() {
		String resourceUrl = url+getStatus;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}
	
	public String cambio() {
		String resourceUrl = url+cambio;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}
	
	public String otroCambio() {
		String resourceUrl = url+otroCambio;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}
	
}
