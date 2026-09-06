package principal;

import java.util.Locale;
import java.util.Scanner;

import retangulo.Calcular;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Calcular calcular = new Calcular();
		
		System.out.println("Calculador de retangulo");
		System.out.print("Largura: ");
		calcular.largura = scanner.nextDouble();
		System.out.print("Altura: ");
		calcular.altura = scanner.nextDouble();
		
		System.out.println("Resultados:");
		System.out.println("Area: " + String.format("%.2f", calcular.area()));
		System.out.println("Perimetro: " + String.format("%.2f", calcular.perimetro()));
		System.out.println("Diagonal: " + String.format("%.2f",  calcular.diagonal())) ;
	}

}
