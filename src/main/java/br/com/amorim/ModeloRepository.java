package br.com.amorim;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModeloRepository extends MongoRepository<Modelo, String>{
	public List<Modelo> findByMarcaId(String marcaId); 
}
