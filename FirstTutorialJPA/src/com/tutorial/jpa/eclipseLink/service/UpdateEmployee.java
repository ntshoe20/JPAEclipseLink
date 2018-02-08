package com.tutorial.jpa.eclipseLink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorial.jpa.eclipseLink.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FirstTutorialJPA" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		try{
			
		      entitymanager.getTransaction( ).begin( );
		      Employee employee = entitymanager.find(Employee.class, 1201 );
		      
		      //before update
		      System.out.println(employee);
		      employee.setSalary(50000);
		      entitymanager.getTransaction().commit();
		      
		      System.out.println( employee );
			
		}catch(Exception e){
			
		}finally {
			 entitymanager.close();
		      emfactory.close();
		}
	            		
	}

}
