package com.concesionaria.Model.Entity;

import java.util.Collection;
import java.util.HashSet;


public class Vehiculo implements java.io.Serializable{
private String patente;
private String marca;
private String modelo;
private String color;
private long precio;
private Collection<Revision> revisiones = new HashSet<Revision>();
private Long oid;

/**
* Constructor de la clase Vehiculo sin parametros
*/	

public Vehiculo(){
	super();
}

/**
* Constructor de la clase Vehiculo con parametros
*/	

public Vehiculo(String patente, String marca, String modelo, String color, long precio){
	this.setPatente(patente);
	this.setMarca(marca);
	this.setModelo(modelo);
	this.setColor(color);
	this.setPrecio(precio);
	this.setRevisiones(null);
}

/**
 * Agrega una revision a la coleccion de Revisiones si es que no esta en la misma
 */
public void addRevision(Revision unaRevision){
	if(this.searchRevision(unaRevision)!=null){
		this.getRevisiones().add(unaRevision);
	}	
}

/**
 * Elimina una revision de la coleccion de Revisiones
 */
public void deleteRevision(Revision unaRevision)
{   		
	if(this.searchRevision(unaRevision)!=null){
		this.getRevisiones().remove(unaRevision);
	}
}

/**
 * Busca una revision en la coleccion de Revisiones
 */
public Revision searchRevision(Revision unaRevision)
{
	for (Revision unaRev : this.getRevisiones()) {
		if (unaRev.equals(unaRevision)) {
			return unaRev;
		}
	}
	return null;
}

public String getPatente() {
	return patente;
}

public void setPatente(String patente) {
	this.patente = patente;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public long getPrecio() {
	return precio;
}

public void setPrecio(long precio) {
	this.precio = precio;
}

public Long getOid() {
	return oid;
}

public void setOid(Long oid) {
	this.oid = oid;
}

public Collection<Revision> getRevisiones() {
	return revisiones;
}

public void setRevisiones(Collection<Revision> revisiones) {
	this.revisiones = revisiones;
}

@Override
	public boolean equals(Object obj) {
		if(this.getOid() != null && obj == null && ((Vehiculo)obj).getOid() != null){
			return this.getOid().equals(((Vehiculo)obj).getOid()); 
		}else{
			return super.equals(obj);
		}
	}


}