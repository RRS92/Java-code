package Pessoas;

public final class Visitantes extends Pessoa {
	protected int idade;
	private double valor;
	
	double soma = 0;

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public void DefinirValorIngresso(double valor) {
		this.valor= valor;
	}

	public void ComprarEntrada() {
		if (idade >=6 && idade <=59 ) {
			soma+=this.getValor();
			System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor+"0");
		}
		else if (idade >=60 ) {
			soma+=this.getValor()/2;
			System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor/2);

		}
		else if (idade <=5 ) {
			soma+= 0;
			System.out.println("Caro " + this.getNome() + " a sua entrada é franca " );
		}

	}

	public int getIdade() {
		return idade;}

	public void setIdade(int idade) {
		this.idade = idade;}

	public double getValor() {
		return valor;}

	public void setValor(double valor) {
		this.valor = valor;}
}