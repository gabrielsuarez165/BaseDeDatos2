package com.concesionaria.interactor;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.concesionaria.Model.Entity.Vehiculo;
import com.concesionaria.generic.GenericImpl;
import com.concesionaria.util.HibernateUtil;
 
 
public class VehiculoInteractor extends GenericImpl<Vehiculo, Long> implements IVehiculo {
 
 public List<Vehiculo> ListarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            vehiculos = session.createQuery("from vehiculo").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return vehiculos;
    }  
 
}