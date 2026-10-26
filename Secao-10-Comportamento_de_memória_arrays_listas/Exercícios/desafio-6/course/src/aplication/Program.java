package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números são: ");
		int quantidade = sc.nextInt();
		double[] numeros = new double[quantidade];
		double soma = 0;
		
		for(int i=0; i<quantidade; i++) {
			System.out.print(i + " número: ");
			double numero = sc.nextDouble();
			numeros[i] = numero; 
			soma += numero;
		}
		
		double avg = soma / quantidade;
		
		System.out.printf("A média dos valores é: %.3f", avg);
		System.out.println();
		System.out.print("Os valores abaixo da média são: ");
		
		for(int i=0; i<quantidade; i++) {
			if(numeros[i] < avg) {
				System.out.print(numeros[i] + ", ");
			}
		}
		
		sc.close();
	}

}
