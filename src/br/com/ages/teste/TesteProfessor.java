package br.com.ages.teste;

import br.com.ages.negocio.Professor;

public class TesteProfessor {
	public static void main(String[] args){
		Professor professor = new Professor();
		professor.setNome("Jow");
		professor.setTurmas("127, 167");
		
		Professor professor1 = new Professor();
		
		validaProfessor(professor1);
	}
	
	private static void validaProfessor(Professor professor){
		if(professor.getNome() == null){
			System.out.println("Professor não inicializado");
			
		}else System.out.println(professor);
	}
	

}
