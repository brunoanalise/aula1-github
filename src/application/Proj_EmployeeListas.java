package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeListas;

public class Proj_EmployeeListas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeListas> list = new ArrayList<>();
		
	// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i= 1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #"+ i +":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeListas(id, name, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		EmployeeListas emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This ID does not exist!");
		} else {
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		for (EmployeeListas obj : list) {
			System.out.println(obj);
		}
		sc.close(); 
	}
}