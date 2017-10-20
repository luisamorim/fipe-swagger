package br.com.amorim;

import org.springframework.data.annotation.Id;
import org.springframework.util.StringUtils;

public class Modelo {

	@Id
	private String mongoId;
	private String id;
	private String name;
	private String marcaId;
	
	public Modelo(){
		
	}
	

	public String getMarcaId() {
		return marcaId;
	}



	public void setMarcaId(String marcaId) {
		this.marcaId = marcaId;
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
