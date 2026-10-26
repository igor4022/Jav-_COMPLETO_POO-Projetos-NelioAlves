package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números são: ");
		int valor = sc.nextInt();
		int[] numeros = new int[valor];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(i + " Digite o número: ");
			int resposta = sc.nextInt();
			numeros[i] = resposta;
		}
		
		int quantidade = 0;
		
		System.out.println();
		System.out.print("NÚMEROS PARES: ");
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				quantidade++;
				System.out.print(numeros[i] + ", ");
			}
		}
		
		System.out.println();
		System.out.print("QUANTOS PARES: " + quantidade);
		
	}

}
