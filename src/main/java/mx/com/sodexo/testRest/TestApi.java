package mx.com.sodexo.testRest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	
	@GetMapping(path = "/testA", produces = MediaType.TEXT_PLAIN_VALUE)
	public String probarGetEventosRealizador(){
		return "Funciona ok";
	}

}
