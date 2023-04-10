package cl.ejemplo.tbkdemo.services;

import cl.ejemplo.tbkdemo.model.LoginRequest;
import cl.ejemplo.tbkdemo.model.Usuario;

public interface LoginService {
	
	public Usuario login (LoginRequest loginRequest);

}
