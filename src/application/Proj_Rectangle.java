package application;


import java.util.Scanner;

import entities.Rectangle;

public class Proj_Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		System.out.println("AREA:= " + rectangle.area() );
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
		
		sc.close();

	}

}
