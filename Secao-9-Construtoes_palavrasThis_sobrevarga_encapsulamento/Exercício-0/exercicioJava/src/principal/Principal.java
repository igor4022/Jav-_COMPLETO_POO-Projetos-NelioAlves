package principal;

import java.util.Scanner;

import entities.Conta;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu ID: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		Conta conta = new Conta(numero, nome);
		
		System.out.println("Deseja fazer um deposito (y/n)");
		System.out.print("Resposta: ");
		String resposta = scanner.nextLine();
		
		if(resposta.equalsIgnoreCase("y")) {
			System.out.print("Dgite seu deposito: ");
			double deposito = scanner.nextDouble();
			conta.calcularDeposito(deposito);
		}
		
		conta.resultado();
		
		System.out.print("Adicionar valor: ");
		double valor = scanner.nextDouble();
		conta.calcularDeposito(valor);
		conta.resultado();
		System.out.println("Pegar valor: ");
		double sacar = scanner.nextDouble();
		conta.calcularSaque(sacar);	
		conta.resultado();
		
	}

}
