package atividade1;

import java.time.LocalDate;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Astrogildo");
		pessoa.setAltura(1.78);
		pessoa.setNascimento(LocalDate.of(2002, 03, 25));
		System.out.println(pessoa);
	}

}
