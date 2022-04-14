package it.engineering.web.testapp.repository;

import java.util.List;

import javax.persistence.EntityManager;


import it.engineering.web.testapp.domain.User;
import it.engineering.web.testapp.persistence.MyEMFactory;


public class UserRepository {
	
	
	
	
public List<User> getAll(){
		
		EntityManager em = MyEMFactory.getEntityManagerFactory().createEntityManager();
		
		//JPQL
		//List<Manufacturer> manufacturers = em.createQuery("select m from Manufacturer m" , Manufacturer.class).getResultList();
		
		List<User> users = em.createNamedQuery("User.findAll", User.class).getResultList();
		
		//SQL upit,  native query
		//List<Manufacturer> manufacturers = em.createNativeQuery("select * from manufacturer", Manufacturer.class).getResultList();
		
		em.close();
		return users;
		
	}

}
