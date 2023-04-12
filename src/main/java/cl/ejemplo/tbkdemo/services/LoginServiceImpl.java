package cl.ejemplo.tbkdemo.services;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.ejemplo.tbkdemo.model.LoginRequest;
import cl.ejemplo.tbkdemo.model.Usuario;
import cl.ejemplo.tbkdemo.repository.UserRepositoryJPA;


@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	
	private final static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	@Autowired
	@Qualifier("userRepositoryJPA")
	private UserRepositoryJPA userRepositoryJPA;

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
		logger.info("LoginServiceImpl test coneccion 2");
		
		
		ArrayList<Usuario> listaUsuarios =  (ArrayList<Usuario>) userRepositoryJPA.listarUsuarios();
		
		for (Iterator iterator = listaUsuarios.iterator(); iterator.hasNext();) {
			Usuario usuario2 = (Usuario) iterator.next();
			
			logger.info("LoginServiceImpl usuario: "+usuario2.getUsuario());
			logger.info("LoginServiceImpl usuario id: "+usuario2.getId());
			logger.info("LoginServiceImpl usuario email: "+usuario2.getEmail());
			
		}   
		
		
		return usu;
	}

}
