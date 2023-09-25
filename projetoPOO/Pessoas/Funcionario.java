package Pessoas;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String cargo;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(double salario, String cargo) {
		super();
		this.salario = salario;
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void ReceberSalario() {
		
	}

}
