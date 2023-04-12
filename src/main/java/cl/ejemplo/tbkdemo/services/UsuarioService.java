package cl.ejemplo.tbkdemo.services;

import java.util.List;

import cl.ejemplo.tbkdemo.model.Usuario;

public interface UsuarioService {

	public Usuario agregar (Usuario usuario);
	
	public Usuario buscarUsuario (String id);
	
	public List<Usuario> listarUsuarios ();
	
}
