package entities;

public class Pessoa {
	private String nome;
	private String email;
	private int apartamento;
	
	public Pessoa(String nome, String email, int apartamento) {
		this.nome = nome;
		this.email = email;
		this.apartamento = apartamento;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getApartamento() {
		return apartamento;
	}

	
}
