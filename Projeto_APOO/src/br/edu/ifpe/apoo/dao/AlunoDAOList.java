package br.edu.ifpe.apoo.dao;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

import java.util.ArrayList;
import java.util.List;


public class AlunoDAOList implements AlunoDAO {
	
	private List<Aluno> alunos = new ArrayList<>();

	private static AlunoDAOList instancia;
	private static int minimo = 5;
	private static int maximo = 100;
	
    public static AlunoDAOList getInstancia() {
        if (instancia == null) {
            instancia = new AlunoDAOList();
        }
        return instancia;
    }
    
    private AlunoDAOList() {}
    
    
    @Override
	public  void inserir(Aluno aluno) throws ExcecaoAlunoInvalido {
		if (alunoExiste(aluno.getId())) {
            throw new ExcecaoAlunoInvalido("ID inválida!");
        }
		validarAluno(aluno);
        alunos.add(aluno);
	}

	
    @Override
	public boolean remover(long id) throws ExcecaoAlunoInvalido {
		if (!alunoExiste(id)) {
            throw new ExcecaoAlunoInvalido("Aluno não encontrado!");
        }
        return alunos.removeIf(aluno -> aluno.getId() == id);
	}
	
	
    @Override
	public void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido {
    	if (!alunoExiste(aluno.getId())) {
            throw new ExcecaoAlunoInvalido("ID não encontrado no sistema!");
        }
    	validarAluno(aluno);
	    for (int i = 0; i < alunos.size(); i++) {
	        Aluno existingAluno = alunos.get(i);
	        if (existingAluno.getId() == aluno.getId()) {
	            existingAluno.setNome(aluno.getNome());
	            existingAluno.setCpf(aluno.getCpf());
	            existingAluno.setEmail(aluno.getEmail());

	            return;
	        }
	    }
	    throw new ExcecaoAlunoInvalido("Aluno não encontrado");
	}

	
    @Override
	public Aluno get(long id) throws ExcecaoAlunoInvalido {
	    for (Aluno aluno : alunos) {
	        if (aluno.getId() == id) {
	            return aluno.clone();
	        }
	    }
	    throw new ExcecaoAlunoInvalido("Aluno não encontrado com o ID: " + id);
	}

	
	
	private void validarAluno(Aluno aluno) throws ExcecaoAlunoInvalido {
        if (aluno.getNome() == null || aluno.getNome().length() < minimo && aluno.getNome().length() > maximo) {
            throw new ExcecaoAlunoInvalido("Nome do aluno inválido, não atende os requisitos!");
        }
    }
	
	private boolean alunoExiste(long id) {
        return alunos.stream().anyMatch(aluno -> aluno.getId() == id);
    }
    
}
