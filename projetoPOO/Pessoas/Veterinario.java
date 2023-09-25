package Pessoas;

public class Veterinario extends Funcionario {
	
	private int crmv;
	
	public Veterinario() {
		// TODO Auto-generated constructor stub
	}
	
	public Veterinario(int crmv, double salario, String cargo) {
		super(salario, cargo);
		this.crmv = crmv;
	}

	public int getCrmv() {
		return crmv;
	}

	public void setCrmv(int crmv) {
		this.crmv = crmv;
	}

	public void AplicarMedicamento() {}

}
