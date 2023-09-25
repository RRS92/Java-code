package Cenarios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Pessoas.Visitantes;

import Setores.Administracao;
import Setores.Setor;

public class Cenario3 {	public static void main(String[] args) {

	List<Visitantes> visitantes = new ArrayList<Visitantes>();

	Setor administracao = new Administracao();
	administracao.setNomeSetor("Administração");
	((Administracao)administracao).setVisitantes(visitantes);

	try (Scanner inpute = new Scanner(System.in)) {

		boolean continuar = true;
		while (continuar) { System.out.println(); 
		System.out.print("Deseja continuar (s/n): "); 

		String sair = inpute.nextLine(); 
		if (sair.equalsIgnoreCase("n")) {
			continuar = false; // Sai do loop se o comando for "n"
		} 
		else {
			Visitantes visitante = new Visitantes();

			visitante.DefinirValorIngresso(10);

			System.out.println();
			System.out.print("Digite seu nome: "); 
			String nome = inpute.nextLine(); 
			visitante.setNome(nome); 

			System.out.println();
			System.out.print("Digite sua idade para saber o valor do ingresso: "); 
			System.out.println();
			int idade = inpute.nextInt(); 
			visitante.setIdade(idade);
			inpute.nextLine();
			visitante.ComprarEntrada();

			visitantes.add(visitante);
		}
		}
		System.out.println();
		System.out.println("-------- Lista de visitantes do Zoologico --------");
		System.out.println();

		for (Visitantes adlista : ((Administracao)administracao).getVisitantes()){
			System.out.println("Nome do visitante: " + adlista.getNome()+ " /" +" idade do visitante: "+adlista.getIdade());

		}
	}
	
	double ValorGeral =0;
	for (Visitantes vis : visitantes) {
		ValorGeral+=vis.getSoma();
	}
	
	System.out.println();
	System.out.println("-------- Total de dinheiro arrecadado --------");
	System.out.println();
	System.out.println("Valor total arrecadado no dia: R$ "+ ValorGeral);
}
}

