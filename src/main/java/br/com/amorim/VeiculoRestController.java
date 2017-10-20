package br.com.amorim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoRestController {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	
	@RequestMapping(path="/veiculos/{marca}/{anoModelo}/{veiculo}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Veiculo> findByMarcaAndAnoModeloAndVeiculoLike(@PathVariable String marca,@PathVariable  String anoModelo,@PathVariable String veiculo){
		return veiculoRepository.findByMarcaAndAnoModeloAndVeiculoLikeIgnoreCase(marca, anoModelo, veiculo);
	}
}
