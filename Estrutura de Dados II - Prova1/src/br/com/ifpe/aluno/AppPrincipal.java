package br.com.ifpe.aluno;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AppPrincipal {

	public static void main(String[] args) {
		
		List<Aluno> turma = new ArrayList<>();
        turma.add(new Aluno("Rebson", 1, 8.5));
        turma.add(new Aluno("João", 2, 7.0));
        turma.add(new Aluno("Everton", 3, 9.5));
        turma.add(new Aluno("Fernanda", 4, 6.5));
        turma.add(new Aluno("Yanka", 5, 9.0));
        turma.add(new Aluno("Kauã", 6, 7.5));
        turma.add(new Aluno("Jair", 7, 8.0));
        turma.add(new Aluno("Lucas", 8, 6.0));
        turma.add(new Aluno("Aline", 9, 9.8));
        turma.add(new Aluno("Carol", 10, 5.5));
        
        // a. Imprimir na tela o nome de todos os alunos da turma.
        System.out.println("Nome de todos alunos(as): ");
        for (Aluno aluno : turma) {
			System.out.println( aluno.getNome());
		}
        
        System.out.println("----------------------------------");
        
        //b. Imprimir na tela o nome dos alunos com média maior ou igual a 7.
        System.out.println("Nome dos alunos(as) com nota maior ou igual a 7:");
        for (Aluno aluno : turma) {
			if(aluno.getMediaGlobal() >= 7) {
				System.out.println( aluno.getNome());
			}
		}
        
        System.out.println("----------------------------------");
        
      // c. Imprimir na tela o nome e a média dos alunos com média maior que 9 (ordenados por nota).
        System.out.println("Alunos com nota maior que 9 por ordem decrescente:");
        List<Aluno> alunosComMediaMaiorQue9 = new ArrayList<>();
        for (Aluno aluno : turma) {
            if (aluno.getMediaGlobal() > 9.0) {
                alunosComMediaMaiorQue9.add(aluno);
            }
        }
        Collections.sort(alunosComMediaMaiorQue9, (a, b) -> Double.compare(b.getMediaGlobal(), a.getMediaGlobal()));
        for (Aluno aluno : alunosComMediaMaiorQue9) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.getMediaGlobal());
        }
        
        System.out.println("----------------------------------");
        
       // d. Imprimir na tela a média geral da turma.
        double somaNotas = 0;
        for(Aluno aluno : turma) {
        	somaNotas = somaNotas + aluno.getMediaGlobal();
        }
        double mediaGeral = somaNotas / turma.size();
        System.out.printf("A média geral da turma é: "+ "%.3f%n", mediaGeral);
        
        
        System.out.println("----------------------------------");
        
      // e. Imprimir na tela a maior nota da turma.
        double maiorNota = Double.MIN_VALUE;
        for (Aluno aluno : turma) {
            if (aluno.getMediaGlobal() > maiorNota) {
                maiorNota = aluno.getMediaGlobal();
            }
        }
        System.out.println("Maior Nota: " + maiorNota);
	
        
        System.out.println("----------------------------------");
        
      // f. Imprimir na tela a menor nota da turma.
        double menorNota = Double.MAX_VALUE;
        for (Aluno aluno : turma) {
            if (aluno.getMediaGlobal() < menorNota) {
                menorNota = aluno.getMediaGlobal();
            }
        }
        System.out.println("Menor Nota: " + menorNota);
        
        
        System.out.println("----------------------------------");
        
     // g. Criar uma outra lista com os nomes dos alunos que possuem média acima da média da turma.
        System.out.println("Nomes dos alunos com média acima da média da turma:");
        List<String> nomesAcimaMediaGeral = new ArrayList<>();
        for (Aluno aluno : turma) {
			if (aluno.getMediaGlobal() > mediaGeral) {
				nomesAcimaMediaGeral.add(aluno.getNome());
			}
		}
        System.out.println(nomesAcimaMediaGeral);
	}
}
