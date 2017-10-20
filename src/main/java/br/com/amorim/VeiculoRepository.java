package br.com.amorim;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VeiculoRepository extends MongoRepository<Veiculo,String>{

	public List<Veiculo> findByMarcaAndAnoModeloAndVeiculoLikeIgnoreCase(String marca, String anoModelo, String veiculo);
	
}
