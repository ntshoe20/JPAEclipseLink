package com.tutorial.jpa.eclipseLink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorial.jpa.eclipseLink.entity.Employee;

public class CreateEmployee {
	
	public static void main(String...args){
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FirstTutorialJPA" );//same as in the persistence.xml
		EntityManager entitymanager = emfactory.createEntityManager( );
		Employee employee = new Employee( );
	      
		try{
			 
		      entitymanager.getTransaction().begin();
		      
		      //Employee values
		      employee.setemployee_id(1202);
		      employee.setEname("James");
		      employee.setSalary(45000);
		      employee.setDeg("Developer");
		      
		      entitymanager.persist(employee);//save the details to the DB, no commit yet.
		      entitymanager.getTransaction().commit();//commit transaction then check the DB

			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			entitymanager.close( );
		      emfactory.close( );
		}
		
	}

}
