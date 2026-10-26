package aplication;

import java.util.Scanner;

import entitien.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números são: ");
		int numero = sc.nextInt();
		Product[] produto = new Product[numero];
		
		
		for(int i=0; i<numero; i++) {
			System.out.print(i + " número: ");
			sc.nextLine();
			int valor = sc.nextInt();
			produto[i] = new Product(valor);
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for(int i=0; i<numero; i++) {
			if(produto[i].resultado() < 0) {
				System.out.println("Valor " + i + ": " + produto[i].resultado());
			}
		}

	}

}
