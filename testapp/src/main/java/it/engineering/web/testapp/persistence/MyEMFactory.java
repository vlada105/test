package it.engineering.web.testapp.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEMFactory {
	
	private static MyEMFactory instance;
	private EntityManagerFactory emf;
	
	
	private MyEMFactory() {
		emf = Persistence.createEntityManagerFactory("testapp");
	}
	
	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(instance == null) {
			 instance  = new MyEMFactory();
		}
		return instance.getEmf();
	}	
	
	private EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEntityManagerFactory() {
		if(instance != null) {
			instance.getEmf().close();
		}
	}
	
	

}
