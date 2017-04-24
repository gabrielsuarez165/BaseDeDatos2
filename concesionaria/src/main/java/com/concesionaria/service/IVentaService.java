package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Venta;
 
public interface IVentaService {
     public void GuardarVenta(Venta ventaacargar);
     public void ActualizarVenta(Venta ventaacargar);
     public void EliminarVenta(Venta miventa);
     public List<Venta> ListarVentas();
}