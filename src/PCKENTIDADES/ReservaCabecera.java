package PCKENTIDADES;

public class ReservaCabecera {
	private Integer nro_reserva;
	private Usuario oUsuario;
	private Integer numMesa;
	private String fecha;
	private String hora;
	private Integer cant_personas;
	private String dia_semana;
	private String estado;

	public ReservaCabecera() {
		super();
	}

	public ReservaCabecera(Integer nroReserva, Usuario oUsuario,
			Integer numMesa, String fecha, String hora, Integer cantPersonas,
			String diaSemana, String estado) {
		super();
		nro_reserva = nroReserva;
		this.oUsuario = oUsuario;
		this.numMesa = numMesa;
		this.fecha = fecha;
		this.hora = hora;
		cant_personas = cantPersonas;
		dia_semana = diaSemana;
		this.estado = estado;
	}

	public Integer getNro_reserva() {
		return nro_reserva;
	}

	public void setNro_reserva(Integer nroReserva) {
		nro_reserva = nroReserva;
	}

	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public Integer getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(Integer numMesa) {
		this.numMesa = numMesa;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Integer getCant_personas() {
		return cant_personas;
	}

	public void setCant_personas(Integer cantPersonas) {
		cant_personas = cantPersonas;
	}

	public String getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(String diaSemana) {
		dia_semana = diaSemana;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
