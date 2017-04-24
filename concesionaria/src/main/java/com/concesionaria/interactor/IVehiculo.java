package com.concesionaria.interactor;

import java.util.List;
import com.concesionaria.Model.Entity.Vehiculo;
import com.concesionaria.generic.Generic;
 
public interface IVehiculo extends Generic<Vehiculo, Long> {
 public List<Vehiculo> ListarVehiculos();
}