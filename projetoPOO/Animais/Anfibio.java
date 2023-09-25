package Animais;

public class Anfibio extends Animal {

	@Override
	public void Curiosidade() {
		System.out.println("Curiosodade sobre esse tipo de anfibio: " + this.getCuriosidade());

	}
	
	public void Metamorfose() {
		System.out.println(this.getNome() + " sofre metamorfose da fase de girino até a fase adulta!");
	}

}
