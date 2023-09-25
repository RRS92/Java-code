package Setores;

import java.util.List;
import Pessoas.Veterinario;
import Animais.Animal;

public class ClinicaVeterinaria extends Setor {
	
	private List <Veterinario> veterinarios;
	private List <Medicamento> medicamentos;
	private List <Animal> animaisDoentes;
	
	//MÉTODO QUE ESTARIA DENTRO DO OBJETO VETERINÁRIO (MENSAGEM)
	public void aplicarMedicamento() {
		System.out.println("Os medicamentos precisam ser aplicados, de acordo com a receita!");

	}

	public List<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(List<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<Animal> getAnimaisDoentes() {
		return animaisDoentes;
	}

	public void setAnimaisDoentes(List<Animal> animaisDoentes) {
		this.animaisDoentes = animaisDoentes;
	}
	
	public void listarMedicamentos() {
		System.out.println("Lista de Medicamentos");
		for (Medicamento medicamentosZoo : medicamentos) {
			System.out.println("--------------------------------------------");
			System.out.println("Nome: " + medicamentosZoo.getNome());
			System.out.println("Função: " + medicamentosZoo.getFuncao());
			System.out.println("Fórmula: " + medicamentosZoo.getFormula());
			System.out.println("Via: " + medicamentosZoo.getVia());
			System.out.println("Data de Validade: " + medicamentosZoo.getDataValidade());
			System.out.println("--------------------------------------------");

		}
	}
	
	public void listarAnimaisDoentes() {
		
		System.out.println("Lista de Animais Doentes");
		for (Animal animaisDoentesZoo : animaisDoentes) {
			System.out.println("--------------------------------------------");
			System.out.println("Nome: " + animaisDoentesZoo.getNome());
			System.out.println("Nome científico: " + animaisDoentesZoo.getNomeCientifico());
			System.out.println("Sexo: " + animaisDoentesZoo.getSexo());
			System.out.println("--------------------------------------------");

		}
		
	}
}
