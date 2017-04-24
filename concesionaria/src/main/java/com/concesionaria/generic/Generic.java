package com.concesionaria.generic;

import java.io.Serializable;

public interface Generic<Entity, PK extends Serializable> {
  void Guardar(Entity t);
  void Actualizar(Entity t);
  Entity Buscar(PK id);
  void Eliminar(Entity t);
}