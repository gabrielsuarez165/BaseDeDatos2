package model;

import java.util.Date;


public class Venta {
private int montoTotal;
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

public Venta(int montoTotal, Cliente cliente, Vehiculo vehiculo){
	this.setMontoTotal(montoTotal);
	this.setFecha(new Date());
	this.setCliente(cliente);
	this.setVehiculo(vehiculo);	
}

public int getMontoTotal() {
	return montoTotal;
}

public void setMontoTotal(int montoTotal) {
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

public void setOid(int oid) {
	this.oid = oid;
}


}