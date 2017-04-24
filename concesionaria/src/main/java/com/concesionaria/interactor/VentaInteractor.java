package com.concesionaria.interactor;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.concesionaria.Model.Entity.Venta;
import com.concesionaria.generic.GenericImpl;
import com.concesionaria.util.HibernateUtil;
 
 
public class VentaInteractor extends GenericImpl<Venta, Long> implements IVenta {
 
 public List<Venta> ListarVentas() {
        List<Venta> ventas = new ArrayList<Venta>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            ventas = session.createQuery("from venta").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return ventas;
    }  
 
}