package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos ospedes são: ");
		int quantidade = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[10];
		
		for(int i=0; i<quantidade; i++) {
			sc.nextLine();
			System.out.println(i + " PESSOA: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Apartamento: ");
			int apartamento = sc.nextInt();
			
			pessoa[apartamento] = new Pessoa(nome, email, apartamento);
			
		}
		
		System.out.println("HÓSPEDES: ");

		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i] != null) {
				System.out.println(pessoa[i].getApartamento() + ", " +
		                   pessoa[i].getNome() + ", " +
		                   pessoa[i].getEmail());
			}
		}
	
		sc.close();
	}
}
