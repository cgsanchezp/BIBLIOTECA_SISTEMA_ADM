package PCKENTIDADES;

public class Factura {
	
	private Integer idFactura;
	private Usuario oUsuario;
	private ReservaCabecera oCabecera;
	private Double total;
	private Double monto_recibido;
	private String modoPago;
	private String tipo_factura;
	private String nyaCliente;
	private Double CUIT;
	private String estado;
	public Factura() {
		super();
	}
	public Factura(Integer idFactura, Usuario oUsuario,
			ReservaCabecera oCabecera, Double total, Double montoRecibido,
			String modoPago, String tipoFactura, String nyaCliente,
			Double cUIT, String estado) {
		super();
		this.idFactura = idFactura;
		this.oUsuario = oUsuario;
		this.oCabecera = oCabecera;
		this.total = total;
		monto_recibido = montoRecibido;
		this.modoPago = modoPago;
		tipo_factura = tipoFactura;
		this.nyaCliente = nyaCliente;
		CUIT = cUIT;
		this.estado = estado;
	}
	public Integer getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}
	public Usuario getoUsuario() {
		return oUsuario;
	}
	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}
	public ReservaCabecera getoCabecera() {
		return oCabecera;
	}
	public void setoCabecera(ReservaCabecera oCabecera) {
		this.oCabecera = oCabecera;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getMonto_recibido() {
		return monto_recibido;
	}
	public void setMonto_recibido(Double montoRecibido) {
		monto_recibido = montoRecibido;
	}
	public String getModoPago() {
		return modoPago;
	}
	public void setModoPago(String modoPago) {
		this.modoPago = modoPago;
	}
	public String getTipo_factura() {
		return tipo_factura;
	}
	public void setTipo_factura(String tipoFactura) {
		tipo_factura = tipoFactura;
	}
	public String getNyaCliente() {
		return nyaCliente;
	}
	public void setNyaCliente(String nyaCliente) {
		this.nyaCliente = nyaCliente;
	}
	public Double getCUIT() {
		return CUIT;
	}
	public void setCUIT(Double cUIT) {
		CUIT = cUIT;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
