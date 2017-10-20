package br.com.amorim;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnoController {

	
	@RequestMapping(path="/years",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getAnos(){
		List<Integer> result = new ArrayList<>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = 1970; i <= year; i++) {
			result.add(i);
		}
		
		return result;
	}
}
