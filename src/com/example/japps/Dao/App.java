package com.example.japps.Dao;

import java.util.Scanner;

//import com.example.japps.Model.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDao();
		String choice;
		do {
			System.out.println("******");
			System.out.println("c. Create Employee");
			System.out.println("d. Display Employee");
			System.out.println("u. Update Employee");
			System.out.println("e. Exit");
			System.out.println("******");
			System.out.print("Enter Option: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.next();
			
			switch (choice.toUpperCase()) {
			case "C": {
				employeeDao.createEmployee();
				
				break;
			}
			
			case "D": {
				employeeDao.showEmployee();
				break;
			}
			
			case "U": {
				employeeDao.updateEmployee();
				break;
			}
			
			case "E":{
				System.exit(1);
			}
			
			
			default:
				System.out.println("Wrong Choice ");
			}
		}while(true);
		
	}

}
