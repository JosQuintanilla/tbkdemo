package cl.ejemplo.tbkdemo.model;

public class ResponseJSON {
	
	private Integer status;
	private String descripcion;
	private Object payload;
	
	public ResponseJSON() {
		super();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}
	

}
