package aplication;

import java.util.Locale;
import java.util.Scanner;
import entites.Tringle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Tringle x, y;
		x = new Tringle();
		y = new Tringle();
		
		
		System.out.println("Digite os tamanhos dos lados do X: ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();
		
		System.out.println("Digite os tamanhos dos lados do Y: ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangulo X tem a are de: %.4f%n", areaX);
		System.out.printf("Triangulo Y tem a are de: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A area do X é maior do que a do Y");
		} else {
			System.out.println("A area do Y é maior do que a do X");
		}
		
		scanner.close();

	}

}
