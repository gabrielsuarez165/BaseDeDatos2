package com.concesionaria.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.concesionaria.Model.Entity.Empresa;
import com.concesionaria.Model.Entity.Venta;


public class ConcesionariaLoader {

	private static SessionFactory sessions;

	
	public static void main(String[] args) {
		try
		{
		System.out.println("----------------------- Setting up Hibernate -----------------------");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");

		System.out.println("Droping schema.........");
		new SchemaExport(cfg).drop(true, true);
		System.out.println("DONE.");

		System.out.println("Generating schema.........");
		new SchemaExport(cfg).create(true, true);
		System.out.println("DONE.");

		System.out.println("Building sessions.........");
		sessions = cfg.buildSessionFactory();
		Empresa concesionaria = cargarEmpresa();

		Session session = sessions.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(concesionaria);
			session.flush();
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}
		session.disconnect();

		System.out.println("DONE.");
	} catch (Exception e) {
		System.out.println("------------------------FAIL.------------------------");
		e.printStackTrace();
	}

		
	}
	
	
	public static Empresa cargarEmpresa(){
		Empresa empre = new Empresa();
		 Venta obj = new Venta();
	        System.out.println("Guardando");
	        obj.setMontoTotal(445);
	        java.util.Date fechaActual = new java.util.Date();
	        obj.setFecha(fechaActual);
	        
	        Venta obj2 = new Venta();
	        System.out.println("Guardando");
	        obj2.setMontoTotal(445);
	        java.util.Date fechaActual2 = new java.util.Date();
	        obj2.setFecha(fechaActual2);
	     
	        empre.addVenta(obj2);
	        empre.addVenta(obj);
	        return empre;
	        
	        
	        
		
		
		
	}

}
