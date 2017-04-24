package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Cliente;
 
public interface IClienteService {
     public void GuardarCliente(Cliente clienteacargar);
     public void ActualizarCliente(Cliente clienteacargar);
     public void EliminarCliente(Cliente micliente);
     public List<Cliente> ListarClientes();
}