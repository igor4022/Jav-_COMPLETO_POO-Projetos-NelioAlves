package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números são: ");
		int valor = sc.nextInt();
		
		Product[] product = new Product[valor];
		
		for(int i=0; i<valor; i++) {
			System.out.print(i + " número: ");
			int numero = sc.nextInt();
			product[i] = new Product(numero);
		}
		
		System.out.print("NÚMEROS: ");
		
		for(int i=0; i<valor; i++) {
			System.out.print(product[i].getValor() + ", ");
		}
		
		System.out.println();
		System.out.print("NÚMEROS SOMADOS: ");
		
		int soma = 0;
		
		for(int i=0; i<valor; i++) {
			soma += product[i].getValor();
		}
		
		System.out.println(soma);
		
		System.out.print("MÉDIA: ");
		double avg = soma / valor;
		System.out.println(avg);
	}

}
