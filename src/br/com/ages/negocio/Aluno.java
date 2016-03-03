package br.com.ages.negocio;

public class Aluno {
	private String nome;
	private int peso;

	public Aluno() {
		
	}

	public Aluno(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", peso=" + peso + "]";
	}

}
