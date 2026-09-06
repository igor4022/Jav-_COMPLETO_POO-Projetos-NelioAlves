package aplicatioin;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Digite seu produto:");
		System.out.print("Nome: ");
		product.name = scanner.nextLine();
		System.out.print("Preço: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = scanner.nextInt();
		
		System.out.println();
		System.out.println(" produto: " + product);
		
		System.out.println();
		System.out.println("Adicionar produto no estoque: ");
		
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println(" produto atulizado: " + product);
		
		System.out.println();
		System.out.println("Remover produto no estoque: ");
		
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println(" produto atulizado: " + product);
		
		scanner.close();
	}

}
