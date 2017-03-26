package model;

public class Cliente{
private int dni;
private String nombre;
private String direccion;
private String ciudad;
private String telefono;
private long oid;

/**
* Constructor de la clase Cliente sin parametros
*/

public Cliente(){
	super();
}

/**
* Constructor de la clase Cliente con parametros
*/	

public Cliente(int dni, String nombre, String direccion, String ciudad, String telefono){
	this.setDni(dni);
	this.setNombre(nombre);
	this.setDireccion(direccion);
	this.setCiudad(ciudad);
	this.setTelefono(telefono);

}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public long getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}


}