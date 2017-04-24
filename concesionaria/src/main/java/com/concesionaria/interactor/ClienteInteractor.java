package com.concesionaria.interactor;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.concesionaria.Model.Entity.Cliente;
import com.concesionaria.generic.GenericImpl;
import com.concesionaria.util.HibernateUtil;
 
 
public class ClienteInteractor extends GenericImpl<Cliente, Long> implements ICliente {
 
 public List<Cliente> ListarClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            clientes = session.createQuery("from Cliente").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return clientes;
    }  
 
}