package PCKENTIDADES;

public class ReservaDetalle {
	private Integer idDetReserva;
	private ReservaCabecera oCabecera;
	private ItemMenu oItemMenu;
	private Integer cantidad;
	private String comentario;
	private String estado;
	
	public ReservaDetalle() {
		super();
	}

	public ReservaDetalle(Integer idDetReserva, ReservaCabecera oCabecera,
			ItemMenu oItemMenu, Integer cantidad, String comentario,
			String estado) {
		super();
		this.idDetReserva = idDetReserva;
		this.oCabecera = oCabecera;
		this.oItemMenu = oItemMenu;
		this.cantidad = cantidad;
		this.comentario = comentario;
		this.estado = estado;
	}

	public Integer getIdDetReserva() {
		return idDetReserva;
	}

	public void setIdDetReserva(Integer idDetReserva) {
		this.idDetReserva = idDetReserva;
	}

	public ReservaCabecera getoCabecera() {
		return oCabecera;
	}

	public void setoCabecera(ReservaCabecera oCabecera) {
		this.oCabecera = oCabecera;
	}

	public ItemMenu getoItemMenu() {
		return oItemMenu;
	}

	public void setoItemMenu(ItemMenu oItemMenu) {
		this.oItemMenu = oItemMenu;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
