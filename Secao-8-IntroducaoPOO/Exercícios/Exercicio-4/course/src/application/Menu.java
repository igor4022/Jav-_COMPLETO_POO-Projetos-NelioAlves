package application;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valor = scanner.nextDouble();
		System.out.print("Hoe Many dollars will be bought? ");
		double dollar = scanner.nextDouble();
		
		System.out.printf("Amout to be paid in reais = R$%.2f", CurrencyConverter.valorFinal(dollar, valor));

	}

}
