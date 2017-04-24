package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Vehiculo;
import com.concesionaria.interactor.VehiculoInteractor;
import com.concesionaria.interactor.IVehiculo;
 
 
 
public class VehiculoService implements IVehiculoService {
 
 private IVehiculo Vehiculo; 
  
 public VehiculoService() {
	 Vehiculo = new VehiculoInteractor();
 }
 
 public void GuardarVehiculo(Vehiculo vehiculoacargar) {
	 Vehiculo.Guardar(vehiculoacargar); 
 }
 
 public void ActualizarVehiculo(Vehiculo vehiculoacargar) {
	 Vehiculo.Actualizar(vehiculoacargar); 
 }
 
 public void EliminarVehiculo(Vehiculo vehiculo) {
	 Vehiculo.Eliminar(vehiculo);  
 }
 
 public List<Vehiculo> ListarVehiculos() {
  return Vehiculo.ListarVehiculos();
 }
 
  
 
}