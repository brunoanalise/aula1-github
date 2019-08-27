package application;

import java.util.Scanner;

import entities.Aluno;

public class Proj_Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Write name: ");
		aluno.nome= sc.nextLine();
		System.out.print("Nota 01: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 02: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 03: ");
		aluno.nota3 =sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f" , aluno.notaTotal());
		System.out.println();
		if (aluno.notaTotal() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println(aluno);
		}
				
		sc.close();

	}

}
