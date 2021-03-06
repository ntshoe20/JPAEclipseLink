package com.tutorial.jpa.eclipseLink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorial.jpa.eclipseLink.entity.Employee;

public class FindEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "FirstTutorialJPA" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      try{
	    	  Employee employee = entitymanager.find( Employee.class, 1201 );

	          System.out.println("employee ID = " + employee.getemployee_id());
	          System.out.println("employee NAME = " + employee.getEname( ));
	          System.out.println("employee SALARY = " + employee.getSalary( ));
	          System.out.println("employee DESIGNATION = " + employee.getDeg( ));
	    	    
	      }catch(Exception e){
	    	  
	      }finally {
				 entitymanager.close();
			      emfactory.close();
			}
		
		
	}

}
