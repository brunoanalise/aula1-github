package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary -= tax;
	}
	
	public void increaseSalary (double percentage) {
		this.grossSalary = ((grossSalary + tax) * ((percentage / 100.00) + 1.00) )- tax;
	}
	
	public String toString ( ) {
		return name 
			+ ", $"
			+ String.format("%.2f", grossSalary);
				
	}
}
