package application;

import java.util.Scanner;

import entities.Employee;

public class Proj_Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("tax: ");
		employee.tax = sc.nextDouble();

		
		
		System.out.println();
		System.out.println("Employee: " + employee.name + ", $" + employee.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? " );
		int percentage = sc.nextInt();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data:" + employee);
		
		
		sc.close();
		

	}

}
