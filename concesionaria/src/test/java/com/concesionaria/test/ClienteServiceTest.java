package com.concesionaria.test;

import com.concesionaria.Model.Entity.Cliente;
import com.concesionaria.service.ClienteService;
 
 
public class ClienteServiceTest {
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  
         ClienteService objInteractor = new ClienteService();
   
        Cliente obj = new Cliente();
        System.out.println("Guardando");
        obj.setNombre("Cliente nombre lalala");
        obj.setDireccion("Cliente dir lalalala");
        obj.setCiudad("Cliente ciudad lalala");
        obj.setTelefono("Cliente tel lalalala");
        objInteractor.GuardarCliente(obj);        
        System.out.println("Listando");
        for (Cliente iter : objInteractor .ListarClientes()) {
            System.out.println(iter.getDni() + " - " + iter.getNombre());
        }
        System.out.println("Actualizando");
        obj.setNombre("Cliente de Tecnologia J2EE MODIFICADO");
        objInteractor.ActualizarCliente(obj);
        System.out.println("Listando");
        for (Cliente iter : objInteractor.ListarClientes()) {
            System.out.println(iter.getOid() + " - " + iter.getNombre());
        }
        System.out.println("Eliminando");
        objInteractor.EliminarCliente(obj);
        System.out.println("Listando");
        for (Cliente iter : objInteractor.ListarClientes()) {
            System.out.println(iter.getOid() + " - " + iter.getNombre());
        }
         
 
 }
 
}