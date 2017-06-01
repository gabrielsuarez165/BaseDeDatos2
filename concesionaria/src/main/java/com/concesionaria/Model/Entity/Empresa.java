package com.concesionaria.Model.Entity;

import java.util.Collection;
import java.util.HashSet;


public class Empresa implements java.io.Serializable {
private String nombre;
private String telefono;
private String direccion;
private long oid;
private Collection<Vehiculo> vehiculos = new HashSet<Vehiculo>();
private Collection<Cliente> clientes = new HashSet<Cliente>();
private Collection<Venta> ventas = new HashSet<Venta>();
/*** Constructor de la clase Empresa sin parametros */
public Empresa(){
	super();
}

/**
 * Constructor de la clase Empresa con parametros
 */

public Empresa(String nombre, String telefono, String direccion){
	this.setNombre(nombre);
	this.setTelefono(telefono);
	this.setDireccion(direccion);
}

/**
 * Agrega un vehiculo a la coleccion Vehiculos si es que no esta en la misma
 */

public void addVehiculo(Vehiculo unVehiculo){
	if(this.searchVehiculo(unVehiculo.getPatente())!=null){
		this.getVehiculos().add(unVehiculo);
	}	
}

/**
 * Agrega un cliente a la coleccion Clientes si es que no esta en la misma
 */

public void addCliente(Cliente unCliente){
	if(this.searchCliente(unCliente.getDni())!=null){
		this.getClientes().add(unCliente);
	}
}

/**
 * Agrega una venta a la coleccion Ventas si es que no esta en la misma y elimina el vehiculo de la coleccion Vehiculos porque ya se encuentra vendido
 */

public void addVenta(Venta unaVenta){
	if(this.searchVenta(unaVenta.getVehiculo().getPatente(), unaVenta.getCliente().getDni())!=null){
		this.getVentas().add(unaVenta);
		this.deleteVehiculo(unaVenta.getVehiculo());
	}
}

/**
 * Busca un vehiculo en la coleccion Vehiculos por medio del ingreso de una patente
 */

public Vehiculo searchVehiculo(String unaPatente)
{
	for (Vehiculo unVehiculo : this.getVehiculos()) {
		if (unVehiculo.getPatente().equals(unaPatente)) {
			return unVehiculo;
		}
	}
	return null;
}

/**
 * Busca un cliente en la coleccion Clientes por medio del ingreso de un DNI
 */

public Cliente searchCliente(long unDni)
{
	for (Cliente unCliente : this.getClientes()) {
		if (unCliente.getDni() == unDni) {
			return unCliente;
		}
	}
	return null;
}

/**
 * Busca una venta en la coleccion Ventas por medio del ingreso de una patente y un DNI
 */

public Venta searchVenta(String unaPatente, long unDni)
{
	for (Venta unaVenta : this.getVentas()) {
		if ((unaVenta.getVehiculo().getPatente() == unaPatente)&&(unaVenta.getCliente().getDni() == unDni)) {
			return unaVenta;
		}
	}
	return null;
}

/**
 * Elimina un vehiculo de la coleccion Vehiculos 
 */

public void deleteVehiculo(Vehiculo unVehiculo)
{   		
	if(this.searchVehiculo(unVehiculo.getPatente())!=null){
		this.getVehiculos().remove(unVehiculo);
	}
}

/**
 * Elimina un cliente de la coleccion Clientes
 */

public void deleteCliente(Cliente unCliente)
{   		
	if(this.searchCliente(unCliente.getDni())!=null){
		this.getClientes().remove(unCliente);
	}
}

/**
 * Elimina una venta de la coleccion Ventas
 */

public void deleteVenta(Venta unaVenta)
{   		
	if(this.searchVenta(unaVenta.getVehiculo().getPatente(),unaVenta.getCliente().getDni())!=null){
		this.getVentas().remove(unaVenta);
	}
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public long getOid() {
	return oid;
}

public void setOid(long oid) {
	this.oid = oid;
}

public Collection<Vehiculo> getVehiculos() {
	return vehiculos;
}

public void setVehiculos(Collection<Vehiculo> vehiculos) {
	this.vehiculos = vehiculos;
}

public Collection<Cliente> getClientes() {
	return clientes;
}

public void setClientes(Collection<Cliente> clientes) {
	this.clientes = clientes;
}

public Collection<Venta> getVentas() {
	return ventas;
}

public void setVentas(Collection<Venta> ventas) {
	this.ventas = ventas;
}


}