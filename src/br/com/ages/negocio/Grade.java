package br.com.ages.negocio;

public class Grade {
	private float nota;
	private String dataNota;
	private Aluno aluno;
	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	public Grade(float nota, String dataNota, Aluno aluno) {
		super();
		this.nota = nota;
		this.dataNota = dataNota;
		this.aluno = aluno;
	}

	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public String getDataNota() {
		return dataNota;
	}
	public void setDataNota(String dataNota) {
		this.dataNota = dataNota;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	@Override
	public String toString() {
		return "Grade [nota=" + nota + ", dataNota=" + dataNota + ", aluno=" + aluno + "]";
	}
	
}
