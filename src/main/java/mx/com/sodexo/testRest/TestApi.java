package mx.com.sodexo.testRest;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import mx.com.sodexo.entidades.EventoRealizado;


@RestController
public class TestApi {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping(path = "/testA", produces = MediaType.TEXT_PLAIN_VALUE)
	public String probarGetEventoRealizado(){
		
		EventoRealizado evento1;
		evento1 = this.restTemplate.getForObject("http://localhost:8080/eventosRealizados/{nEvento}", 
				EventoRealizado.class, "1");
		
		return evento1.toString();
	}
	
	@GetMapping(path = "/testB", produces = MediaType.TEXT_PLAIN_VALUE)
	public String probarGetEventosRealizados(){
		
		EventoRealizado[] eventos;
		eventos = this.restTemplate.getForObject("http://localhost:8080/eventosRealizados", 
				EventoRealizado[].class);
		
		return Arrays.asList(eventos).toString();
	}

}
