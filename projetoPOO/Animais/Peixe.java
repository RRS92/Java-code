package Animais;

public class Peixe extends Animal {

	@Override
	public void Curiosidade() {
		System.out.println("Curiosodade sobre esse tipo de peixe: " + this.getCuriosidade());

	}
	
	public void Nadar() {
		System.out.println(this.getNome() + " Nada durante todo o dia!");
	}

}
