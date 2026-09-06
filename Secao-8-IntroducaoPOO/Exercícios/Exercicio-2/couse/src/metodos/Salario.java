package metodos;

public class Salario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		 grossSalary = grossSalary * (1 + porcentage / 100);
	}
}
