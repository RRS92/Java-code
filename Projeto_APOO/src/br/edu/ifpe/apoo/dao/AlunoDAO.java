package br.edu.ifpe.apoo.dao;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public interface AlunoDAO {
	
	public void inserir(Aluno aluno) throws ExcecaoAlunoInvalido;
	public void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido;
	public boolean remover(long id) throws ExcecaoAlunoInvalido;
	public Aluno get(long id) throws ExcecaoAlunoInvalido;
}
