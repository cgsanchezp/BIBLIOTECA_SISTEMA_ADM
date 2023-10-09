package PCKENTIDADES;

public class SubCategoria {
	private Integer id_sub;
	private Categoria oCategoria;
	private String nombre_sub;
	public SubCategoria() {
		super();
	}
	public SubCategoria(Integer idSub, Categoria oCategoria, String nombreSub) {
		super();
		id_sub = idSub;
		this.oCategoria = oCategoria;
		nombre_sub = nombreSub;
	}
	public Integer getId_sub() {
		return id_sub;
	}
	public void setId_sub(Integer idSub) {
		id_sub = idSub;
	}
	public Categoria getoCategoria() {
		return oCategoria;
	}
	public void setoCategoria(Categoria oCategoria) {
		this.oCategoria = oCategoria;
	}
	public String getNombre_sub() {
		return nombre_sub;
	}
	public void setNombre_sub(String nombreSub) {
		nombre_sub = nombreSub;
	}
	
	
}
