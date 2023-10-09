package PCKENTIDADES;

public class Usuario {
private Integer idusu;
private String nomusuario;
private String pass;
private Cargo oCargo;
private String nombre;
private String apellido;
private String dni;
private String e_mail;
private String hra_entrada;
private String hra_salida;
private String telefono;
private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

public Integer getIdusu() {
	return idusu;
}
public void setIdusu(Integer idusu) {
	this.idusu = idusu;
}
public String getNomusuario() {
	return nomusuario;
}
public void setNomusuario(String nomusuario) {
	this.nomusuario = nomusuario;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public Cargo getoCargo() {
	return oCargo;
}
public void setoCargo(Cargo oCargo) {
	this.oCargo = oCargo;
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
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String eMail) {
	e_mail = eMail;
}
public String getHra_entrada() {
	return hra_entrada;
}
public void setHra_entrada(String hraEntrada) {
	hra_entrada = hraEntrada;
}
public String getHra_salida() {
	return hra_salida;
}
public void setHra_salida(String hraSalida) {
	hra_salida = hraSalida;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}


}
