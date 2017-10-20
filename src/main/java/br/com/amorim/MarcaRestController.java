package br.com.amorim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarcaRestController {

	@Autowired
	MarcaRepository repository;
	
	@RequestMapping(path="/marcas",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Marca> findAll(){
		return repository.findAll();
	}
}
