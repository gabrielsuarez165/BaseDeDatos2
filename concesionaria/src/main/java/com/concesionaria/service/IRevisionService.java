package com.concesionaria.service;

import java.util.List;
import com.concesionaria.Model.Entity.Revision;
 
public interface IRevisionService {
     public void GuardarRevision(Revision revisionacargar);
     public void ActualizarRevision(Revision revisionacargar);
     public void EliminarRevision(Revision unarevision);
     public List<Revision> ListarRevisiones();
}