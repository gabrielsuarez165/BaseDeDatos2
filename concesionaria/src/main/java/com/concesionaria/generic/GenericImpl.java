package com.concesionaria.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
 
public class GenericImpl<Entity, K extends Serializable> implements Generic<Entity, K> {
public Class<Entity> domainClass = getDomainClass();
private Session session;
protected Class getDomainClass() {
   if (domainClass == null) {
   ParameterizedType thisType = (ParameterizedType) getClass()
     .getGenericSuperclass();
   domainClass = (Class) thisType.getActualTypeArguments()[0];
   }
  return domainClass;
}
private Session getHibernateTemplate() {
  session = com.concesionaria.util.HibernateUtil.getSessionFactory().openSession();
  session.beginTransaction();
  return session;
}
public Entity Buscar(K id) {
  Entity returnValue = (Entity) getHibernateTemplate().load(domainClass, id);
  session.getTransaction().commit();
  return returnValue;
}
public void Actualizar(Entity t) {
    getHibernateTemplate().update(t);
    session.getTransaction().commit();  
}  
 public void Guardar(Entity t) {
    getHibernateTemplate().save(t);
    session.getTransaction().commit();
 }
 public void Eliminar(Entity t) {
   getHibernateTemplate().delete(t);
   session.getTransaction().commit();
 }
}