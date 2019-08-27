package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	public double perimeter() {
		return 2 * (width + heigth);
		
	}
	public double diagonal() {
		double soma = (width * width) + (heigth * heigth);
		double diag = Math.sqrt(soma);
		return diag;
	
	}
}
