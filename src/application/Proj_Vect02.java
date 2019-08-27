package application;

import java.util.Scanner;

import entities.Vect02;

public class Proj_Vect02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vect02[] vect = new Vect02[n];
		
		for (int i =0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vect02(name, price);
		}
		
		double sum = 0.0;
		for (int i =0; i<vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		
		sc.close();

	}

}
