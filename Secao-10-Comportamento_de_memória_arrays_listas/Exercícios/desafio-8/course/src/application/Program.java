package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas pessoas são: ");
		int numeros = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[numeros];
		Pessoa maisVelho = null;
		String nomeVelho;
		
		for(int i=0; i<numeros; i++) {
			sc.nextLine();
			System.out.println(i + " PESSOA");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoa(nome, idade);
			
			if(maisVelho == null || pessoa[i].getIdade() > maisVelho.getIdade()) {
				maisVelho = pessoa[i];
			}
		}
		
		System.out.println("Apessoa mais velha é " + maisVelho.getNome());
		
		sc.close();

	}

}
