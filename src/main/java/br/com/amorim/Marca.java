package br.com.amorim;

import org.springframework.data.annotation.Id;

public class Marca {

	@Id
	private String mongoId;
	private String id;
	private String name;
	
	public Marca() {
		// TODO Auto-generated constructor stub
	}

	public String getMongoId() {
		return mongoId;
	}

	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
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
