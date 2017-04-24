package com.concesionaria.test;

import com.concesionaria.Model.Entity.Venta;
import com.concesionaria.service.VentaService;
 
 
public class VentaServiceTest {
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  
         VentaService objInteractor = new VentaService();
   
        Venta obj = new Venta();
        System.out.println("Guardando");
        obj.setMontoTotal(445);
        java.util.Date fechaActual = new java.util.Date();
        obj.setFecha(fechaActual);
        objInteractor.GuardarVenta(obj);        
        System.out.println("Listando");
        for (Venta iter : objInteractor .ListarVentas()) {
            System.out.println(iter.getFecha() + " - " + iter.getMontoTotal());
        }
        System.out.println("Actualizando");
        obj.setMontoTotal(1000);
        objInteractor.ActualizarVenta(obj);
        System.out.println("Listando");
        for (Venta iter : objInteractor.ListarVentas()) {
            System.out.println(iter.getOid() + " - " + iter.getFecha());
        }
        System.out.println("Eliminando");
        objInteractor.EliminarVenta(obj);
        System.out.println("Listando");
        for (Venta iter : objInteractor.ListarVentas()) {
            System.out.println(iter.getOid() + " - " + iter.getFecha());
        }
    }
 }
 