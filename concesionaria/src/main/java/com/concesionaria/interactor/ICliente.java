package com.concesionaria.interactor;

import java.util.List;
import com.concesionaria.Model.Entity.Cliente;
import com.concesionaria.generic.Generic;
 
public interface ICliente extends Generic<Cliente, Long> {
 public List<Cliente> ListarClientes();
}