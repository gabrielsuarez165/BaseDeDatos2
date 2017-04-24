package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Vehiculo;
 
public interface IVehiculoService {
     public void GuardarVehiculo(Vehiculo vehiculoacargar);
     public void ActualizarVehiculo(Vehiculo vehiculoacargar);
     public void EliminarVehiculo(Vehiculo mivehiculo);
     public List<Vehiculo> ListarVehiculos();
}