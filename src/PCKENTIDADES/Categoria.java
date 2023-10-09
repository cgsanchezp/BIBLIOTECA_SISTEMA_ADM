package PCKENTIDADES;

public class Categoria {
	private Integer idCargo;
	private TipoItemMenu oItemMenu;
	private String nombre_cat;
	public Categoria() {
		super();
	}
	public Categoria(Integer idCargo, TipoItemMenu oItemMenu, String nombreCat) {
		super();
		this.idCargo = idCargo;
		this.oItemMenu = oItemMenu;
		nombre_cat = nombreCat;
	}
	public Integer getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}
	public TipoItemMenu getoItemMenu() {
		return oItemMenu;
	}
	public void setoItemMenu(TipoItemMenu oItemMenu) {
		this.oItemMenu = oItemMenu;
	}
	public String getNombre_cat() {
		return nombre_cat;
	}
	public void setNombre_cat(String nombreCat) {
		nombre_cat = nombreCat;
	}

	
	
}
