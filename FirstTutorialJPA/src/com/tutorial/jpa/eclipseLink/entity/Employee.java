package com.tutorial.jpa.eclipseLink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Created By Itumeleng - 2018:02:07
 * 
 */

@Entity 
@Table
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO) 	
   
   private int employee_id; //employee ID
   private String ename; //EmployeeName
   private double salary; //Employee salary
   private String deg; //degree
   
   public Employee(int employee_id, String ename, double salary, String deg) {
      super( );
      this.employee_id = employee_id;
      this.ename = ename;
      this.salary = salary;
      this.deg = deg;
   }

   public Employee( ) {
      super();
   }

   public int getemployee_id( ) {
      return employee_id;
   }
   
   public void setemployee_id(int employee_id) {
      this.employee_id = employee_id;
   }
   
   public String getEname( ) {
      return ename;
   }
   
   public void setEname(String ename) {
      this.ename = ename;
   }

   public double getSalary( ) {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDeg( ) {
      return deg;
   }
   
   public void setDeg(String deg) {
      this.deg = deg;
   }
   
   @Override
   public String toString() {
      return "Employee [employee_id=" + employee_id + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
    }
}
