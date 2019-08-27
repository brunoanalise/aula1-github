package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Proj_ContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		ContaBancaria contabancaria;
		
		System.out.println();
		System.out.print("Is there an initial deposit (y /n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value : " );
			double inicialDeposit = sc.nextDouble();
			contabancaria = new ContaBancaria(number, holder, inicialDeposit);
		}
		else {
			contabancaria = new ContaBancaria(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(contabancaria);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contabancaria.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(contabancaria);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		contabancaria.withDraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(contabancaria);
		sc.close();

	}

}
