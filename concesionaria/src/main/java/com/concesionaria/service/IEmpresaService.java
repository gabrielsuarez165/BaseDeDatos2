package com.concesionaria.service;

import com.concesionaria.Model.Entity.Empresa;
 
public interface IEmpresaService {
     public void GuardarEmpresa(Empresa empresaacargar);
     public void ActualizarEmpresa(Empresa empresaacargar);
     public void EliminarEmpresa(Empresa miempresa);
}