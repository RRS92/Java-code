package Animais;

public class Mamifero extends Animal {

	@Override
	public void Curiosidade() {
		System.out.println("Curiosodade sobre esse tipo de mamifero: " + this.getCuriosidade());
		
	}
	
	public void Amamentar() {
		System.out.println("A fêmea de " + this.getNome() + " Amamenta seus filhotes!");
	}

}
