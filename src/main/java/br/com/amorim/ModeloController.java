package br.com.amorim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModeloController {

	@Autowired
	ModeloRepository modeloRepository;
	
	@RequestMapping(path="/modelos/{marcaId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Modelo> findByMarcaId(@PathVariable String marcaId){
		List<Modelo> result = modeloRepository.findByMarcaId(marcaId);
		for (Modelo modelo : result) {
			String[] parts = modelo.getName().split(" ");
			modelo.setName(parts[0]);
		}
		
		return result;
	}
}
