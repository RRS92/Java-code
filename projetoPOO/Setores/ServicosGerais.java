package Setores;

public class ServicosGerais extends Setor {
	private String turno;
	
	public ServicosGerais() {
		// TODO Auto-generated constructor stub
	}

	public ServicosGerais(String turno) {
		super();
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	

}
