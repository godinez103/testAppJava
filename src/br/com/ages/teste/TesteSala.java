package br.com.ages.teste;

import br.com.ages.negocio.Sala;

public class TesteSala {

	public static void main(String[] args) {
		Sala sala126 = new Sala();
		sala126.setNome("AGES");
		sala126.setNumeroCadeiras(20);
		sala126.setNumeroMesas(2);
		System.out.println(sala126.getNome());
		System.out.println(sala126.getNumeroCadeiras());
		System.out.println(sala126.getNumeroMesas());
		
		Sala sala128 = new Sala();
		validaSala(sala128);
	}
	private static void validaSala(Sala sala) {
		if (sala.getNome() == null) {
			System.out.println("Sala não inicializada");
		}
		else {
			System.out.println("O nome da sala é: " + sala.getNome());
		}
		
	}

}