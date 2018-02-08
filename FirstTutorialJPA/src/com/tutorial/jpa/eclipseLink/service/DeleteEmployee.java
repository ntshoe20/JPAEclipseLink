package com.tutorial.jpa.eclipseLink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorial.jpa.eclipseLink.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FirstTutorialJPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
		
		try{ 
			entitymanager.getTransaction( ).begin( );//start JPA transaction
			Employee employee = entitymanager.find( Employee.class, 1201 );//find the employee with the number
		    entitymanager.remove( employee );//remove the employee object
		    entitymanager.getTransaction( ).commit( );//commit transaction
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			 entitymanager.close();
		      emfactory.close();
			
		}

	}

}
