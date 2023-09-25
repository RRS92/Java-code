package Animais;

public class Reptil extends Animal {

	@Override
	public void Curiosidade() {
		System.out.println("Curiosodade sobre esse tipo de reptil: " + this.getCuriosidade());

	}
	
	public void TrocarPele() {
		System.out.println(this.getNome() + "troca de pele!");
	}
	
}
