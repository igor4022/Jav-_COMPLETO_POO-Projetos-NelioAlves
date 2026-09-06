package principal;

import java.util.Scanner;

import classes.Aluno;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		boolean resposta = false;
		
		do {
			System.out.println("Descubra se passou");
			System.out.print("Nome: ");
			aluno.name = scanner.nextLine();
			System.out.print("Primeiro Semestre: ");
			aluno.nota1 = scanner.nextDouble();
			System.out.print("Segunda Semestre: ");
			aluno.nota2 = scanner.nextDouble();
			System.out.print("Terceiro Semestre: ");
			aluno.nota3 = scanner.nextDouble();
			scanner.nextLine();
			
			if(aluno.nota1 >= 0 && aluno.nota1 <= 30.00 && 
			   aluno.nota2 >= 0 && aluno.nota2 <= 35.00 && 
			   aluno.nota3 >= 0 && aluno.nota3 <= 35.00) {
				resposta = true;
			} else {
				System.out.println("Notas Invalidas");
			}
			
		} while (resposta != true);
		
		System.out.println("Resultado:");
		if(aluno.calcularNota() < 65.00) {
			System.out.println("Você não passou sua nota é " + aluno.calcularNota());
			System.out.println("Faltou " + String.format("%.2f", aluno.quantosFaltou()));
		} else {
			System.out.println("Você passou sua nota é " + String.format("%.2f", aluno.calcularNota()));
		}
		
		scanner.close();
	}

}
