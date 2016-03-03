package br.com.ages.teste;

import br.com.ages.negocio.Aluno;
import br.com.ages.negocio.Grade;

public class TesteGrade {

	public static void main(String args[]) {

		Aluno aluno = new Aluno();
		aluno.setNome("Carlos");
		aluno.setPeso(1);

		Grade grade = new Grade();
		grade.setNota(5.0f);
		grade.setDataNota("12/02/2007");
		grade.setAluno(aluno);

		Grade grade1 = new Grade();
		validaGrade(grade1);
	}

	public static void validaGrade(Grade grade) {
		if (grade.getAluno() == null) {
			System.out.println(grade.getAluno());
			System.out.println("Grade inesistente");
		} else {
			System.out.println(grade);
		}

	}
}
