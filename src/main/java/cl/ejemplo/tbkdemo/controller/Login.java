package cl.ejemplo.tbkdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ejemplo.tbkdemo.model.LoginRequest;
import cl.ejemplo.tbkdemo.model.Usuario;
import cl.ejemplo.tbkdemo.services.LoginService;

@RestController
@RequestMapping("/api")
public class Login {

	
	private final static Logger logger = Logger.getLogger(Login.class);
	
	@Autowired
	private LoginService loginServices;
	
	@PostMapping("/login")
	public Usuario usuario (@RequestBody LoginRequest loginRequest) {
		
		logger.info("login init");
		logger.info("login usuario: "+loginRequest.getUsuario());
		
		logger.info("login password: "+loginRequest.getPassword());
		
		
		Usuario usu = loginServices.login(loginRequest);
		
		return usu;
	}
}
