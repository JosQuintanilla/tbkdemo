package cl.ejemplo.tbkdemo.model;

public class LoginRequest {
	
	private String usuario;
	private String password;
	
	public LoginRequest() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
