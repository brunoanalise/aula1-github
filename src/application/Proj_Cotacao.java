package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Proj_Cotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		CurrencyConverter.precodollar = sc.nextDouble();
		System.out.print("How many dollers will be boutgh?");
		CurrencyConverter.valordollar = sc.nextDouble();
		System.out.println("Amount to be paid in reais =" + CurrencyConverter.calcReais());
		sc.close();
	}

}
