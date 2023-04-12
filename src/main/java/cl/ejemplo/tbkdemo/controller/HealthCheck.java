package cl.ejemplo.tbkdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ejemplo.tbkdemo.model.ResponseJSON;

@RestController
@RequestMapping("/apitbk")
public class HealthCheck {
	
	private final static Logger logger = Logger.getLogger(HealthCheck.class);
	private final ResponseJSON resJSON = new ResponseJSON();
	
	@Value("${build.version}")
	private String version;
	
	
	@GetMapping("/version")
	public ResponseJSON healcheck() {	
		
		logger.info("version: "+version);
		resJSON.setDescripcion("OK");
		resJSON.setStatus(200);
		resJSON.setPayload(version);
		logger.info("resJSON: "+resJSON);
		return resJSON;
	}

}
