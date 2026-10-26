package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas são: ");
		int quantidade = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[quantidade];
		double soma = 0.0;
		int mulheres = 0;
		int homens = 0;
		
		for(int i=0; i<quantidade; i++) {
			sc.nextLine();
			System.out.println(i + " PESSOA:");
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.print("Sexo: ");
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, genero);
			
			if(genero == 'M' || genero == 'm') {
				soma += pessoa[i].getAltura();
				mulheres++;
			} else {
				homens++;
			}
		}
		
		double avg = soma / mulheres;
		System.out.println("A média de alutura: " + avg);
		System.out.println("Quantidade de homens " + homens);

	}
}
