package Setores;

public final class  Medicamento {
	
	private String nome;
	private String funcao;
	private String formula;
	private String via;
	private String dataValidade;
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	public Medicamento(String nome, String funcao, String formula, String via, String dataValidade) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.formula = formula;
		this.via = via;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
