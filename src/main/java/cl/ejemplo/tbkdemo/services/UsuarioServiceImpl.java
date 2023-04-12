package cl.ejemplo.tbkdemo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ejemplo.tbkdemo.model.Usuario;
import cl.ejemplo.tbkdemo.repository.UsuarioRepositoryJPA;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService{

private final static Logger logger = Logger.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private UsuarioRepositoryJPA usuarioRepository;
	
	@Override
	public Usuario agregar(Usuario usuario) {
		logger.info("UsuarioServiceImpl - agregar - init");
		
		usuarioRepository.save(usuario);
		
		return usuario;
	}

	@Override
	public Usuario buscarUsuario(String id) {
		logger.info("UsuarioServiceImpl - buscarUsuario - init");
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		logger.info("UsuarioServiceImpl - listarUsuarios - init");
		List<Usuario> listaUsuarios = new ArrayList<>();
		try {
			listaUsuarios = usuarioRepository.listarUsuario();
			
			for (Iterator iterator = listaUsuarios.iterator(); iterator.hasNext();) {
				Usuario usuario2 = (Usuario) iterator.next();
				logger.info("UsuarioServiceImpl  - listarUsuarios - usuario email: "+usuario2.getEmail());
			} 
			
		} catch (Exception e) {
			logger.error("UsuarioServiceImpl  - listarUsuarios - error: "+e);
		}
		return listaUsuarios;
	}

}
