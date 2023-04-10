package cl.ejemplo.tbkdemo.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cl.ejemplo.tbkdemo.model.LoginRequest;
import cl.ejemplo.tbkdemo.model.Usuario;


@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	
	private final static Logger logger = Logger.getLogger(LoginServiceImpl.class);

	@Override
	public Usuario login(LoginRequest loginRequest) {
		
		logger.info("LoginServiceImpl init");
		logger.info("LoginServiceImpl usuario: "+loginRequest.getUsuario());
		
		logger.info("LoginServiceImpls password: "+loginRequest.getPassword());
		
		Usuario usu = new Usuario();
		usu.setNombre(loginRequest.getUsuario());
		usu.setPassword(loginRequest.getPassword());
		usu.setId("111");
		usu.setApellido("Tribiño");
		return usu;
	}

}
