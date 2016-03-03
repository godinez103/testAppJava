package br.com.ages.negocio;


public class Professor {
	private String nome;
	private String turmas;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String nome, String turmas) {
		super();
		this.nome = nome;
		this.turmas = turmas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurmas() {
		return turmas;
	}

	public void setTurmas(String turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", turmas=" +turmas + "]";
	}

}
