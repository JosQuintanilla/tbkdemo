package cl.ejemplo.tbkdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheck {
	
	
	@Value("${build.version}")
	private String version;
	
	
	@GetMapping("/version")
	public String healcheck() {	
		
		System.out.println("version: "+version);
		return version;
	}

}
