package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números são: ");
		int quantidade = sc.nextInt();
		int[] numeros = new int[quantidade];
		double soma = 0.0;
		int par = 0;
		
		for(int i=0; i<quantidade; i++) {
			System.out.print(i + " número: ");
			int numero = sc.nextInt();
			
			numeros[i] = numero;
			
			if(numeros[i] % 2 == 0) {
				soma += numero;
				par++;
			}
		}
		
		double avg = soma / par;
		System.out.print("NÚMEROS PARES: " + avg);
	}

}
