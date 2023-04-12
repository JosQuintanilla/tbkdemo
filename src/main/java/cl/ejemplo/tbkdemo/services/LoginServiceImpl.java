package cl.ejemplo.tbkdemo.services;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ejemplo.tbkdemo.model.LoginRequest;
import cl.ejemplo.tbkdemo.model.Usuario;
import cl.ejemplo.tbkdemo.repository.UsuarioRepositoryJPA;


@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	
	private final static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private UsuarioRepositoryJPA usuarioRepositoryJPA;

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
		
		logger.info("LoginServiceImpl conecion mysql");
		
		
		
		
		
		
		
		
		
		return usu;
	}

}
