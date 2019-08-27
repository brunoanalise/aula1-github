package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal () {
		return nota1 + nota2 + nota3;
	}
	public double diferencaMedia () {
		return 60 - notaTotal();
	}
	public String toString ( ) {
		return "MISSING "
				+ String.format("%.2f", diferencaMedia() )
				+ " POINTS";
	}
}
