package com.juanns.workshopmongo.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.juanns.workshopmongo.domain.User;

@Document
public class AuthorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;

	public AuthorDTO() {
		
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}