package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import antities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> aprovados = new ArrayList<>();
		
		System.out.print("Quantas pessoas são: ");
		int quantidade = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[quantidade];
		
		double soma = 0.0;
		
		for(int i=0; i<quantidade; i++) {
			sc.nextLine();
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite sua 1 Nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Digite sua 2 Nota: ");
			double nota2 = sc.nextDouble();
			soma = nota1 + nota2;
			double avg = soma / quantidade;
			
			if(avg >= 6.0) {
				aprovados.add(nome);
			}
		}
		
		System.out.println("APROVADOS: ");
		System.out.println(aprovados);
		
	}

}
