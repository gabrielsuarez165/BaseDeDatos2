package com.concesionaria.service;

import java.util.List;

import com.concesionaria.Model.Entity.Venta;
import com.concesionaria.interactor.VentaInteractor;
import com.concesionaria.interactor.IVenta;
 
 
 
public class VentaService implements IVentaService {
 
 private IVenta Venta; 
  
 public VentaService() {
	 Venta = new VentaInteractor();
 }
 
 public void GuardarVenta(Venta ventaacargar) {
	 Venta.Guardar(ventaacargar); 
 }
 
 public void ActualizarVenta(Venta ventaacargar) {
	 Venta.Actualizar(ventaacargar); 
 }
 
 public void EliminarVenta(Venta venta) {
	 Venta.Eliminar(venta);  
 }
 
 public List<Venta> ListarVentas() {
  return Venta.ListarVentas();
 }
 
  
 
}