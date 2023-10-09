package PCKENTIDADES;

public class TipoItemMenu {
	private Integer idTipo;
	private String nombreTipo;
	private String estado;
	public TipoItemMenu() {
		super();
	}
	public TipoItemMenu(Integer idTipo, String nombreTipo, String estado) {
		super();
		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
		this.estado = estado;
	}
	public Integer getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
