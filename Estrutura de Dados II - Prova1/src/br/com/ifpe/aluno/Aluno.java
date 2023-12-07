package br.com.ifpe.aluno;

public class Aluno {
	private String nome;
	private int matricula;
	private double mediaGlobal;
	
	public Aluno(String nome, int matricula, double mediaGlobal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaGlobal = mediaGlobal;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getMediaGlobal() {
		return mediaGlobal;
	}

	public void setMediaGlobal(double mediaGlobal) {
		this.mediaGlobal = mediaGlobal;
	}
	
}
