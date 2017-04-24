package com.concesionaria.interactor;

import java.util.List;
import com.concesionaria.Model.Entity.Revision;
import com.concesionaria.generic.Generic;
 
public interface IRevision extends Generic<Revision, Long> {
 public List<Revision> ListarRevisiones();
}