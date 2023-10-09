package PCKENTIDADES;

public class ItemMenu {
	
	private Integer idItem;
	private Categoria oCategoria;
	private SubCategoria osuCategoria;
	private String nombre_item;
	private String descripcion;
	private Double precio;
	public ItemMenu() {
		super();
	}
	public ItemMenu(Integer idItem, Categoria oCategoria,
			SubCategoria osuCategoria, String nombreItem, String descripcion,
			Double precio) {
		super();
		this.idItem = idItem;
		this.oCategoria = oCategoria;
		this.osuCategoria = osuCategoria;
		nombre_item = nombreItem;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public Categoria getoCategoria() {
		return oCategoria;
	}
	public void setoCategoria(Categoria oCategoria) {
		this.oCategoria = oCategoria;
	}
	public SubCategoria getOsuCategoria() {
		return osuCategoria;
	}
	public void setOsuCategoria(SubCategoria osuCategoria) {
		this.osuCategoria = osuCategoria;
	}
	public String getNombre_item() {
		return nombre_item;
	}
	public void setNombre_item(String nombreItem) {
		nombre_item = nombreItem;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
