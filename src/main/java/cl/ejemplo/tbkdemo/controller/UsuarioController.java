package cl.ejemplo.tbkdemo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ejemplo.tbkdemo.model.Usuario;
import cl.ejemplo.tbkdemo.services.UsuarioService;

@RestController
@RequestMapping("/apitbk/usuario")
public class UsuarioController {

	private final static Logger logger = Logger.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/agregar")
	public Usuario agregar (@RequestBody Usuario usuario) {
		
		logger.info("UsuarioController - agregar- init");
		logger.info("UsuarioController - agregar- usuario: "+usuario.getUsuario());		
		usuarioService.agregar(usuario);		
		return usuario;
	}
	
	@GetMapping("/buscar/{id}")
	public Usuario buscarUsuario (String id) {
		
		logger.info("UsuarioController - buscarUsuario- init");
		logger.info("UsuarioController - buscarUsuario- id: "+id);		
		Usuario usuario = usuarioService.buscarUsuario(id);		
		return usuario;
	};
	
	@GetMapping("/listar")
	public List<Usuario> listarUsuarios (){
		logger.info("UsuarioController - listarUsuarios- init");
		List<Usuario> listaUsuarios = new ArrayList<>();
		try {
			listaUsuarios = usuarioService.listarUsuarios();			
			for (Iterator iterator = listaUsuarios.iterator(); iterator.hasNext();) {
				Usuario usuario = (Usuario) iterator.next();
				logger.info("UsuarioController - listarUsuarios- email: "+usuario.getEmail());
			} 			
		} catch (Exception e) {
			logger.error("UsuarioController - listarUsuarios- error: "+e);
		}
		return listaUsuarios;
		
	};
}
