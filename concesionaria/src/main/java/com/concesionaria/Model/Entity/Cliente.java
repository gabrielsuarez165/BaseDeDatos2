package com.concesionaria.Model.Entity;

public class Cliente implements java.io.Serializable {
private long dni;
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

public Cliente(long dni, String nombre, String direccion, String ciudad, String telefono){
	this.setDni(dni);
	this.setNombre(nombre);
	this.setDireccion(direccion);
	this.setCiudad(ciudad);
	this.setTelefono(telefono);

}

public long getDni() {
	return dni;
}

public void setDni(long dni) {
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

public void setOid(long oid) {
	this.oid = oid;
}


}