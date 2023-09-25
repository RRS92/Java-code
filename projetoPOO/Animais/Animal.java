package Animais;

public abstract class Animal {
	
	private String nome;
	private String nomeCientifico;
	private String ordem;
	private String familia;
	private String Alimentação;
	private String sexo;
	private int hora;
	private String curiosidade;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String nome, String nomeCientifico, String ordem, String familia, String alimentação,
			String sexo, int hora,String curiosidade) {
		super();
		this.nome = nome;
		this.nomeCientifico = nomeCientifico;
		this.ordem = ordem;
		this.familia = familia;
		Alimentação = alimentação;
		this.sexo = sexo;
		this.hora = hora;
		this.curiosidade = curiosidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getAlimentação() {
		return Alimentação;
	}

	public void setAlimentação(String alimentação) {
		Alimentação = alimentação;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
		
	public String getCuriosidade() {
		return curiosidade;
	}

	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}

	public abstract void Curiosidade();

	public void Comer() {
		System.out.println(this.getNome() + " Se alimenta de " + this.getAlimentação());
		
	}
	
	public void Dormir() {
		System.out.println("Ele dorme " + this.getHora() + " Horas por dia" );
		
	}

}

