package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Cliente;
import com.concesionaria.interactor.ClienteInteractor;
import com.concesionaria.interactor.ICliente;
 
 
 
public class ClienteService implements IClienteService {
 
 private ICliente Cliente; 
  
 public ClienteService() {
    Cliente = new ClienteInteractor();
 }
 
 public void GuardarCliente(Cliente clienteacargar) {
	 Cliente.Guardar(clienteacargar); 
 }
 
 public void ActualizarCliente(Cliente clienteacargar) {
	 Cliente.Actualizar(clienteacargar); 
 }
 
 public void EliminarCliente(Cliente cliente) {
	 Cliente.Eliminar(cliente);  
 }
 
 public List<Cliente> ListarClientes() {
  return Cliente.ListarClientes();
 }
 
  
 
}