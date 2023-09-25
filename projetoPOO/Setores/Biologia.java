package Setores;

import java.util.List;
import Pessoas.Biologo;

public class Biologia extends Setor {

	private List <Biologo> biologos;

	//MÉTODO QUE ESTARIA DENTRO DO OBJETO BIOLÓGO (MENSAGEM)
	public void alimentarAnimal() {
		System.out.println("OS animais estão sendo alimentados!");

	}

	public List<Biologo> getBiologos() {
		return biologos;
	}

	public void setBiologos(List<Biologo> biologos) {
		this.biologos = biologos;
	}

}
