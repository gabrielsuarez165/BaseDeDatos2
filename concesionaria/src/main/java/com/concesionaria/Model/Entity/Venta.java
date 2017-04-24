package com.concesionaria.Model.Entity;

import java.util.Date;


public class Venta implements java.io.Serializable {
private long montoTotal;
private Date fecha;
private Cliente cliente;
private Vehiculo vehiculo;
private long oid;

/**
* Constructor de la clase Venta sin parametros
*/	

public Venta(){
	super();
}

/**
* Constructor de la clase Venta con parametros
*/	

public Venta(long montoTotal, Cliente cliente, Vehiculo vehiculo){
	this.setMontoTotal(montoTotal);
	this.setFecha(new Date());
	this.setCliente(cliente);
	this.setVehiculo(vehiculo);	
}

public long getMontoTotal() {
	return montoTotal;
}

public void setMontoTotal(long montoTotal) {
	this.montoTotal = montoTotal;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Vehiculo getVehiculo() {
	return vehiculo;
}

public void setVehiculo(Vehiculo vehiculo) {
	this.vehiculo = vehiculo;
}

public long getOid() {
	return oid;
}

public void setOid(long oid) {
	this.oid = oid;
}


}