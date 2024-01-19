package com.example.japps.Dao;

import java.util.List;
import java.util.Scanner;

import com.example.japps.Model.Employee;

public class EmployeeDao {
	Employee emp =new Employee ();
	
	public void createEmployee() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter FirstName");
		emp.setFirstName(sc.nextLine());
	  
		System.out.println("Enter LasttName");
		emp.setLastName(sc.nextLine());
	   
		System.out.println("Enter ID");
		emp.setId(sc.nextInt());
	   
		System.out.println("Enter Salary");
		emp.setSalary(sc.nextDouble());
	   
	} 
	   public void showEmployee() {
		   
		   System.out.println("FirstName: " + emp.getFirstName()); 
		   System.out.println("LastName: " + emp.getLastName()); 
		   System.out.println("ID: " + emp.getId()); 
		   System.out.println("Salary: " + emp.getSalary()); 
	   }
	   
	   public void updateEmployee() {
		   
		   int choice;
			do {
				System.out.println("******");
				System.out.println("1. Update Firstname");
				System.out.println("2. Update Lastname");
				System.out.println("3. Update Salary");
				System.out.println("4. Back");
				System.out.println("******");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				
				switch (choice) {
				case 1: {
					System.out.println("enter First name");
					emp.setFirstName(sc.next());
					
					break;
				}
				
				case 2: {
					System.out.println("Enter Lastname");
					emp.setLastName(sc.next());
					
					break;
				}
				
				case 3: {
					System.out.println("Enter Salary");
					emp.setSalary(sc.nextDouble());
					break;
				}
				
				default:
					System.out.println("Wrong Choice ");
				}
			}while(choice!=4);
			
		}
}
	  
