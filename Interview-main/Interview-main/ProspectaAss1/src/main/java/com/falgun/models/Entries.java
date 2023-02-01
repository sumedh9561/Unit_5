package com.falgun.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Entries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@JsonProperty("API")
	private String api;
	
	@JsonProperty("Link")
	private String link;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Auth")
	private String auth;
	
	@JsonProperty("Https")
	private boolean HTTPS;
	
	@JsonProperty("Cors")
	private String cors;
	
	@JsonProperty("Category")
	private String category;
	
	public Entries(String api, String description, String auth, boolean hTTPS, String cors, String link,
			String category) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		HTTPS = hTTPS;
		this.cors = cors;
		this.link = link;
		this.category = category;
	}
	
	public Entries() {
		// TODO Auto-generated constructor stub
	}

	public String getApi() {
		return api;
	}
	
	public void setApi(String api) {
		this.api = api;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public boolean isHTTPS() {
		return HTTPS;
	}
	
	public void setHTTPS(boolean hTTPS) {
		HTTPS = hTTPS;
	}
	
	public String getCors() {
		return cors;
	}
	
	public void setCors(String cors) {
		this.cors = cors;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
