package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public class NegocioFacade {

    private ControladorAluno controlador;
    private ICPFValidator cpfValidator;

    public NegocioFacade() {
        this.controlador = new ControladorAluno();
        this.cpfValidator = new ValidaCPFAdapter();
    }

    public void inserirAluno(long id,String nome, String cpf, String email) throws ExcecaoAlunoInvalido {
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setEmail(email);
        controlador.inserir(aluno);
    }

    public Aluno consultarAluno(long id) throws ExcecaoAlunoInvalido {
        return controlador.get(id);
    }

    public boolean removerAluno(long id) throws ExcecaoAlunoInvalido {
        return controlador.remover(id);
    }

    public void atualizarAluno(long id, String nome, String cpf, String email) throws ExcecaoAlunoInvalido {
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setEmail(email);
        controlador.atualizar(aluno);
    }
    
    public boolean validarCPF(String CPF) {
        return cpfValidator.isValidCPF(CPF);
    }
}

