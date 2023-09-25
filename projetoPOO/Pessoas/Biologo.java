package Pessoas;

public class Biologo extends Funcionario {
	
	private int crbio;
	
	public Biologo() {
		// TODO Auto-generated constructor stub
	}
	
	public Biologo(int crbio, double salario, String cargo) {
		super(salario, cargo);
		this.crbio = crbio;
	}

	public int getCrbio() {
		return crbio;
	}

	public void setCrbio(int crbio) {
		this.crbio = crbio;
	}

	public void AlimentarAnimais() {
		
	}

}
