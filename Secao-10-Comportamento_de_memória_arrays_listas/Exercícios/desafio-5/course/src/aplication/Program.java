package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números são: ");
		int numeros = sc.nextInt();
		
		int[] a = new int[numeros];
		int[] b = new int[numeros];
		int[] c = new int[numeros];
		
		System.out.println("CLASSE A: ");
		for(int i=0; i<numeros; i++) {
			System.out.print(i + " número: ");
			int valorA = sc.nextInt();
			b[i] = valorA;
		}
		System.out.println();
		
		System.out.println("CLASSE B: ");
		for(int i=0; i<numeros; i++) {
			System.out.print(i + " número: ");
			int valorB = sc.nextInt();
			a[i] = valorB;
		}
		System.out.println();
		
		System.out.println("SOMAS DOS VETORES CLASSE C: ");
		for(int i=0; i<numeros; i++) {
			c[i] = a[i] + b[i];
			System.out.println(i + " número: " + c[i]);
		}

	}

}
