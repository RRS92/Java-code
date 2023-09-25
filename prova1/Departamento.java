package prova1;

import java.util.List;

public class Departamento {
	private String nome;
	private List <Funcionario> funcionario;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Departamento(String nome, List<Funcionario> funcionario) {
		super();
		this.nome = nome;
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	

}
