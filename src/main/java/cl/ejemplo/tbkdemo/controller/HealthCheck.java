package cl.ejemplo.tbkdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheck {
	
	private final static Logger logger = Logger.getLogger(HealthCheck.class);
	
	@Value("${build.version}")
	private String version;
	
	
	@GetMapping("/version")
	public String healcheck() {	
		
		logger.info("version: "+version);
		return version;
	}

}
