package com.concesionaria.service;

import java.util.List;

import com.concesionaria.Model.Entity.Revision;
import com.concesionaria.interactor.RevisionInteractor;
import com.concesionaria.interactor.IRevision;
 
 
 
public class RevisionService implements IRevisionService {
 
 private IRevision Revision; 
  
 public RevisionService() {
	 Revision = new RevisionInteractor();
 }
 
 public void GuardarRevision(Revision revisionacargar) {
	 Revision.Guardar(revisionacargar); 
 }
 
 public void ActualizarRevision(Revision revisionacargar) {
	 Revision.Actualizar(revisionacargar); 
 }
 
 public void EliminarRevision(Revision unarevision) {
	 Revision.Eliminar(unarevision);  
 }
 
 public List<Revision> ListarRevisiones() {
  return Revision.ListarRevisiones();
 }
}