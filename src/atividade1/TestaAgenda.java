package atividade1;

import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("Adicionando pessoa..");
		agenda.armazenarPessoa(teclado.next(), teclado.nextInt(), teclado.nextDouble());
		agenda.armazenarPessoa(teclado.next(), teclado.nextInt(), teclado.nextDouble());
		
		System.out.println("Imprimindo pessoa..");
		agenda.imprimePessoa(teclado.nextInt());
		
		System.out.println("Imprimindo agenda..");
		agenda.imprimeAgenda();
		
		System.out.println("Buscando pessoa..");
		System.out.println(agenda.buscarPessoa(teclado.next()));
		
		System.out.println("Removendo pessoa..");
		agenda.removerPessoa(teclado.next());
		
		System.out.println("Imprindo pessoa..");
		agenda.imprimeAgenda();

		System.out.println("Buscando pessoa..");
		System.out.println(agenda.buscarPessoa(teclado.next()));
	}

}
