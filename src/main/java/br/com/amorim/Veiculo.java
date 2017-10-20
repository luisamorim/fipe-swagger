package br.com.amorim;

import org.springframework.data.annotation.Id;

public class Veiculo {

	@Id
	private String mongoId;
	private String marca;
	private String anoModelo;
	private String veiculo;
	private String preco;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	
	public String getMongoId() {
		return mongoId;
	}

	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	
}
