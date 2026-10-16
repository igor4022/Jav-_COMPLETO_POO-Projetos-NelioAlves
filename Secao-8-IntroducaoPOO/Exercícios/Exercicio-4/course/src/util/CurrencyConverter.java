package util;

public class CurrencyConverter {
	
	public static double valorFinal(double dollar, double valor) {
		double total = dollar * valor;
		double taxa = total * 0.06;
		
		return total + taxa;
	}
}
