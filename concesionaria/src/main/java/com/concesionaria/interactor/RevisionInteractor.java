package com.concesionaria.interactor;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.concesionaria.Model.Entity.Revision;
import com.concesionaria.generic.GenericImpl;
import com.concesionaria.util.HibernateUtil;
 
 
public class RevisionInteractor extends GenericImpl<Revision, Long> implements IRevision {
 
 public List<Revision> ListarRevisiones() {
        List<Revision> revisiones = new ArrayList<Revision>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            revisiones = session.createQuery("from revision").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return revisiones;
    }  
 
}