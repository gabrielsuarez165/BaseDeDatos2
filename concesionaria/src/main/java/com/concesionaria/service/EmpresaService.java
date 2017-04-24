package com.concesionaria.service;

import com.concesionaria.Model.Entity.Empresa;
import com.concesionaria.interactor.EmpresaInteractor;
import com.concesionaria.interactor.IEmpresa;
 
 
 
public class EmpresaService implements IEmpresaService {
 
 private IEmpresa Empresa; 
  
 public EmpresaService() {
	 Empresa = new EmpresaInteractor();
 }
 
 public void GuardarEmpresa(Empresa empresaacargar) {
	 Empresa.Guardar(empresaacargar); 
 }
 
 public void ActualizarEmpresa(Empresa empresaacargar) {
	 Empresa.Actualizar(empresaacargar); 
 }
 
 public void EliminarEmpresa(Empresa empresa) {
	 Empresa.Eliminar(empresa);  
 }
  
}
