package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class StudentClass {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String [] operatingSystems;
	
	private LinkedHashMap<String,String> countryOptions;
	
	public StudentClass() {
		
		countryOptions = new LinkedHashMap<>();
		
		this.countryOptions.put("BR","Brazil");
		this.countryOptions.put("GR","Greece");
		this.countryOptions.put("FR","France");
		this.countryOptions.put("DE","Germany");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String [] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String [] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
