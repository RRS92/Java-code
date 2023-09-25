package Setores;

import java.util.List;
import Pessoas.Visitantes;

public class Administracao extends Setor {
	private List<Visitantes> visitantes;
	
	public Administracao() {
		// TODO Auto-generated constructor stub
	}
	
	public Administracao(List<Visitantes> visitantes) {
		super();
		this.visitantes = visitantes;
	}
	
	public List<Visitantes> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(List<Visitantes> visitantes) {
		this.visitantes = visitantes;
	}

	public void pagarFuncionario() {
		System.out.println("Pagando salário aos funcionários... $$$");	
	}

}
