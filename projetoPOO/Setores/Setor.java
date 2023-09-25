package Setores;

import java.util.List;
import Pessoas.Funcionario;

public abstract class Setor {
	
	
	private String nomeSetor;
	private List <Funcionario> funcionarios;

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
