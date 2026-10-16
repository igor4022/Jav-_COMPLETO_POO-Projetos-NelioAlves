package entities;

public class Conta {
	private double saldo = 0.00;
	private int numero;
	private String nome;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	
	public void calcularDeposito(double deposito) {
		this.saldo += deposito;
	}
	
	public double calcularSaque(double valor) {
		return this.saldo  -= valor + 5.0;
	}
	
	public void resultado() {
		System.out.println("Seu nome é " + nome + " seu número de ID é " + numero + " seu saldo é R$" + saldo);
	}
}
 