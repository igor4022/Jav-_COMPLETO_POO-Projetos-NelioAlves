package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite qunatos números são: ");
		int numeros = sc.nextInt();
		int[] quantidade = new int[numeros];
		int maior = quantidade[0];
		int posicao = 0;
		
		for(int i=0; i<quantidade.length; i++) {
			System.out.print(i + " Número: ");
			int valor = sc.nextInt();
			if(maior < valor) {
				maior = valor;
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("O maior número é: " + maior);
		System.out.println("A posição dele é: " + posicao);
	}

}
