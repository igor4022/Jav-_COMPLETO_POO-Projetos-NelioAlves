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
		
		System.out.println(product);
		
		scanner.close();
	}

}
