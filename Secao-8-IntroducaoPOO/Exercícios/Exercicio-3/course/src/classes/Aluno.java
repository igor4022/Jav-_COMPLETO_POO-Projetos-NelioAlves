package classes;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double result;
	
	public double calcularNota() {
		result = nota1 + nota2 + nota3;
		return result;
	}
	
	public double quantosFaltou() {
		return  65.00 - result;
	}
}
