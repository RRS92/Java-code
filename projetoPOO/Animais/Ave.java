package Animais;

public class Ave extends Animal {

	@Override
	public void Curiosidade() {
		System.out.println("Curiosodade sobre esse tipo de ave: " + this.getCuriosidade());
		
	}
	
	public void TrocarPenas() {
		System.out.println(this.getNome() + " Troca as suas penas quando vai para fase adulta!");
	}
	
}
