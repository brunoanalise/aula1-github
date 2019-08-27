package util;

public class CurrencyConverter {

	public static final double PERCENT = 0.06;
	public static double precodollar;
	public static double valordollar;
	public static  double valorreais;
	public static double valormult;
	public static double converter;
	
	public static double calcReais ( ) {
		
		converter = precodollar * valordollar; 
		valormult = (converter * PERCENT) + converter;
		return valormult;
	}
	public String toString () {
		return String.format("%.2f", valormult);
	}
}	
	

