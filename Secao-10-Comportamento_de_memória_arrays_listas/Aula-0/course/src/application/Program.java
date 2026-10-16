package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			vetor[i] = scanner.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetor[i];
		}
		double avg = soma / n;
		
		System.out.println("AVERGE HEIGHT: " + avg);
		
		scanner.close();
	}

}
