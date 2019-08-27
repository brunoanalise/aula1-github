package application;

import java.util.Scanner;

import entities.Rent;

public class Proj_Rent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] vect = new Rent[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Rent #" );
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email =sc.nextLine();
			System.out.print("Rooms: ");
			int room = sc.nextInt();
			vect[i] = new Rent(name, email, room);
			
			}
		System.out.println("Busy rooms:");
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println( vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();

	}

}
