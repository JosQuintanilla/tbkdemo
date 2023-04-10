package cl.ejemplo.tbkdemo.model;

import java.util.Date;

public class Usuario {
	
	private String id;
	private String usuario;	
	private String password;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private Date fechaUltLog;
	
	public Usuario () {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Date getFechaUltLog() {
		return fechaUltLog;
	}

	public void setFechaUltLog(Date fechaUltLog) {
		this.fechaUltLog = fechaUltLog;
	}

}
