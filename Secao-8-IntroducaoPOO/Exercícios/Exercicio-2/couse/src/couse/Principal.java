package couse;

import java.util.Scanner;

import metodos.Salario;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		System.out.println("Cadatres-se");
		System.out.print("Nome: ");
		salario.name = scanner.nextLine();
		System.out.print("Salário: ");
		salario.grossSalary = scanner.nextDouble();
		System.out.print("Taxa: ");
		salario.tax = scanner.nextDouble();
		System.out.println();
		
		System.out.println("Seu noem é " + salario.name + ", seu salário é de R$" + salario.netSalary());
		
		System.out.print("Deseja aumentar o salário: ");
		double porcentage = scanner.nextDouble();
		salario.increaseSalary(porcentage);
		
		System.out.println("Seu noem é " +  salario.name + ", seu salário é de R$" + String.format("%.2f", salario.netSalary()));

	}

}
