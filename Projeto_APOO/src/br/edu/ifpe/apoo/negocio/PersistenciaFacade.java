package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.dao.AlunoDAO;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.dao.AlunoDAOAbstractFactory;

public class PersistenciaFacade {

    private AlunoDAO alunoDAO;
    private ICPFValidator cpfValidator;

    public PersistenciaFacade() {
        
        alunoDAO = AlunoDAOAbstractFactory.getDAO();
        this.cpfValidator = new ValidaCPFAdapter();
    }

    public void inserirAluno(Aluno aluno) throws ExcecaoAlunoInvalido {
        alunoDAO.inserir(aluno);
    }

    public void atualizarAluno(Aluno aluno) throws ExcecaoAlunoInvalido {
        alunoDAO.atualizar(aluno);
    }

    public boolean removerAluno(long id) throws ExcecaoAlunoInvalido {
        return alunoDAO.remover(id);
    }

    public Aluno consultarAluno(long id) throws ExcecaoAlunoInvalido {
        return alunoDAO.get(id);
    }
    
    public boolean validarCPF(String CPF) {
        return cpfValidator.isValidCPF(CPF);
    }
}
