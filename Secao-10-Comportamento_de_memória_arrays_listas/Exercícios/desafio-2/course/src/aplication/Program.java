package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas são: ");
		int pessoas = sc.nextInt();
		Product[] product = new Product[pessoas];
		
		for(int i=0; i<pessoas; i++) {
			sc.nextLine();
			System.out.println("PESSOA " + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Alutra: ");
			double altura = sc.nextDouble();
			product[i] = new Product(nome, idade, altura);
		}
		
		double soma = 0.0;
		
		for(int i=0; i<pessoas; i++) {
			soma += product[i].getAltura();
		}
		
		double avg = soma / pessoas;
		
		System.out.printf("ALTURA MÉDIA: %.2f", avg);
		System.out.println();
		
		int idade = 0;
		
		for(int i=0; i<pessoas; i++) {
			if(product[i].getIdade() <= 16) {
				idade++;
			}
		}
		
		double porcentagem = ((double)idade / pessoas) * 100;
		
		System.out.printf("PORCENTAGEM MENOR DE 16: %.2f", porcentagem);
		System.out.println();
		System.out.print("MENORES DE 16: ");
		
		for(int i=0; i<pessoas; i++) {
			if(product[i].getIdade() <= 16) {
				System.out.print(product[i].getNome() + ", ");
			}
		}
		
		sc.close();
	}

}
