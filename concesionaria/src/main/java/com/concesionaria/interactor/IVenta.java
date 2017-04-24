package com.concesionaria.interactor;

import java.util.List;
import com.concesionaria.Model.Entity.Venta;
import com.concesionaria.generic.Generic;
 
public interface IVenta extends Generic<Venta, Long> {
 public List<Venta> ListarVentas();
}