package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		Product[] vect = new Product[numero];
		
		for(int i=0; i<numero; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		
		for(int i=0; i<numero; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma / numero;
		
		System.out.printf("AVERGE PRICE = %2f%n", avg);
		
		sc.close();

	}

}
