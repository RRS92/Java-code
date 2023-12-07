package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.NegocioFacade;

public class AlunoApresentacao {
	
    private NegocioFacade facade;

    public AlunoApresentacao() {
        this.facade = new NegocioFacade();
    }

    public void exibirMenu() throws ExcecaoAlunoInvalido {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
        	System.out.println("------------------------------");
            System.out.println("Digite a opção desejada");
            System.out.println("1 - para inserir um aluno;");
            System.out.println("2 - para consultar um aluno;");
            System.out.println("3 - para remover um aluno;");
            System.out.println("4 - para alterar um aluno;");
            System.out.println("0 - para sair do sistema.");

            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 0) {
                break; 
            } else if (opcao == 1) {
                inserirAluno();
            } else if (opcao == 2) {
                consultarAluno();
            } else if (opcao == 3) {
                removerAluno();
            } else if (opcao == 4) {
                atualizarAluno();
            } else {
                System.out.println("Opção inválida!!");
            }
        }
    }

    
    private void inserirAluno() throws ExcecaoAlunoInvalido {
    	try {
          Scanner scanner = new Scanner(System.in);
          long id;
          do {
              System.out.print("Digite o ID do(a) aluno(a) a ser inserido(a): ");

              try {
                  id = Long.parseLong(scanner.nextLine());

                  if (id >= Long.MIN_VALUE && id <= Long.MAX_VALUE) {
                      System.out.println("ID do aluno à ser inserido: " + id);
                  } else {
                      System.out.println("ID não é do tipo válido. Tente novamente...");
                      continue;
                  }
              } catch (NumberFormatException e) {
                  System.out.println("ID não é um número válido. Tente novamente...");
                  continue;
              }
              break; 
          } while (true);
          
          System.out.print("Digite o nome do(a) aluno(a): ");
          String nome = scanner.nextLine();
          String cpf;
          do {
              System.out.print("Digite o CPF do(a) aluno(a): ");
              cpf = scanner.nextLine();

              if (!facade.validarCPF(cpf)) {
                  System.out.println("CPF inválido. Tente novamente.");
              }
          } while (!facade.validarCPF(cpf));
          
          System.out.print("Digite o email do(a) aluno(a): ");
          String email = scanner.nextLine();
          
          Aluno.AlunoBuilder alunoBuilder = new Aluno.AlunoBuilder();
          Aluno aluno = alunoBuilder
        	   .id(id)
               .Nome(nome)
               .CPF(cpf)
               .Email(email)
               .build();       
          facade.inserirAluno(aluno.getId(),aluno.getNome(),aluno.getCpf(),aluno.getEmail());
          System.out.println("Aluno inserido com sucesso!");
      } catch (ExcecaoAlunoInvalido ex) {
          System.out.println(ex.getMessage());
      }
       
    }


    private void consultarAluno() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do(a) aluno(a) a ser consultado(a): ");
            long id = Long.parseLong(scanner.nextLine());
            Aluno aluno = facade.consultarAluno(id);
            if (aluno != null) {
                System.out.println("Aluno(a) encontrado(a):");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Email: " + aluno.getEmail());
            } else {
                System.out.println("Aluno(a) não encontrado.");
            }
        } catch (ExcecaoAlunoInvalido ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void removerAluno() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do(a) aluno(a) a ser removido(a): ");
            long id = Long.parseLong(scanner.nextLine());
            boolean removido = facade.removerAluno(id);
            if (removido) {
                System.out.println("Aluno(a) removido(a) com sucesso!");
            } else {
                System.out.println("Aluno(a) não encontrado(a) ou não foi possível remover.");
            }
        } catch (ExcecaoAlunoInvalido ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void atualizarAluno() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do(a) aluno(a) a ser atualizado(a): ");
            long id = Long.parseLong(scanner.nextLine());
            System.out.print("Digite o novo nome do(a) aluno(a): ");
            String nome = scanner.nextLine();
            String cpf;
            do {
                System.out.print("Digite o novo CPF do(a) aluno(a): ");
                cpf = scanner.nextLine();

                if (!facade.validarCPF(cpf)) {
                    System.out.println("CPF inválido. Tente novamente.");
                }
            } while (!facade.validarCPF(cpf));
            System.out.print("Digite o novo Email do(a) aluno(a): ");
            String email = scanner.nextLine();
            facade.atualizarAluno(id, nome, cpf, email);
            System.out.println("Aluno(a) atualizado(a) com sucesso!");
        } catch (ExcecaoAlunoInvalido ex) {
            System.out.println(ex.getMessage());
        }
    }
}
