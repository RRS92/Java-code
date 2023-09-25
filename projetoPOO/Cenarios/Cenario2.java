package Cenarios;

import java.util.List;
import java.util.ArrayList;

import Animais.Animal;
import Animais.Anfibio;
import Animais.Ave;
import Animais.Mamifero;
import Animais.Peixe;
import Animais.Reptil;

import Pessoas.Biologo;
import Pessoas.Funcionario;
import Pessoas.Veterinario;

import Setores.Administracao;
import Setores.Biologia;
import Setores.ClinicaVeterinaria;
import Setores.Medicamento;
import Setores.ServicosGerais;
import Setores.Setor;

public class Cenario2 {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Brian");
		funcionario1.setCpf("447.639.850-27");
		funcionario1.setSalario(10000);
		funcionario1.setCargo("Diretor");

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Bruna");
		funcionario2.setCpf("644.232.690-07");
		funcionario2.setSalario(3800);
		funcionario2.setCargo("Recursos Humanos");

		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Augusto");
		funcionario3.setCpf("620.679.550-04");
		funcionario3.setSalario(2500);
		funcionario3.setCargo("Técnico administrativo");

		Funcionario funcionario4 = new Funcionario();
		funcionario4.setNome("Anthony");
		funcionario4.setCpf("443.077.880-95");
		funcionario4.setSalario(5000);
		funcionario4.setCargo("Técnico em TI");

		Funcionario funcionario5 = new Funcionario();
		funcionario5.setNome("José");
		funcionario5.setCpf("715.523.444.52");
		funcionario5.setSalario(1350);
		funcionario5.setCargo("Limpeza");

		Funcionario funcionario6 = new Funcionario();
		funcionario6.setNome("Maria");
		funcionario6.setCpf("835.643.474.42");
		funcionario6.setSalario(1350);
		funcionario6.setCargo("Limpeza");

		Funcionario funcionario7 = new Funcionario();
		funcionario7.setNome("Paulo");
		funcionario7.setCpf("415.889.554.36");
		funcionario7.setSalario(1350);
		funcionario7.setCargo("Porteiro");

		Funcionario funcionario8 = new Funcionario();
		funcionario8.setNome("Soraia");
		funcionario8.setCpf("458.899.584.63");
		funcionario8.setSalario(1350);
		funcionario8.setCargo("Porteira");

		Funcionario funcionario9 = new Funcionario();
		funcionario9.setNome("Marcos");
		funcionario9.setCpf("789.123.456-58");
		funcionario9.setSalario(2000);
		funcionario9.setCargo("Atendente - Clinica Veterinária");

		Funcionario funcionario10 = new Funcionario();
		funcionario10.setNome("Paula");
		funcionario10.setCpf("456.123.469-78");
		funcionario10.setSalario(2000);
		funcionario10.setCargo("Atendente auxiliar - Clinica Veterinária");

		Funcionario funcionario11 = new Funcionario();
		funcionario11.setNome("Camila");
		funcionario11.setCpf("872.468.249-25");
		funcionario11.setSalario(2000);
		funcionario11.setCargo("Atendente - Biologia");

		Funcionario funcionario12 = new Funcionario();
		funcionario12.setNome("Carol");
		funcionario12.setCpf("973.597.246-28");
		funcionario12.setSalario(2000);
		funcionario12.setCargo("Atendente auxiliar - Biologia");

		Funcionario biologo1 = new Biologo();
		biologo1.setNome("César");
		biologo1.setCpf("920.107.780-73");
		biologo1.setSalario(4650);
		biologo1.setCargo("Biólogo chefe");
		((Biologo)biologo1).setCrbio(1234);

		Funcionario biologo2 = new Biologo();
		biologo2.setNome("Ricardo");
		biologo2.setCpf("154.652.444.78");
		biologo2.setSalario(3650);
		biologo2.setCargo("Biólogo ajudante");
		((Biologo)biologo2).setCrbio(5678);

		Funcionario biologo3 = new Biologo();
		biologo3.setNome("João");
		biologo3.setCpf("155.657.555.89");
		biologo3.setSalario(2900);
		biologo3.setCargo("Biólogo estagiário");
		((Biologo)biologo3).setCrbio(8910);

		Funcionario veterinario1 = new Veterinario();
		veterinario1.setNome("Marcela");
		veterinario1.setCpf("172.842.444.39");
		veterinario1.setSalario(5000);
		veterinario1.setCargo("Veterinária chefe");
		((Veterinario)veterinario1).setCrmv(9876);

		Funcionario veterinario2 = new Veterinario();
		veterinario2.setNome("Lara");
		veterinario2.setCpf("781.632.444.41");
		veterinario2.setSalario(4500);
		veterinario2.setCargo("Veterinária ajudante");
		((Veterinario)veterinario2).setCrmv(4321);

		Funcionario veterinario3 = new Veterinario();
		veterinario3.setNome("Eduardo");
		veterinario3.setCpf("022.144.854.85");
		veterinario3.setSalario(3000);
		veterinario3.setCargo("Veterinário estagiário");
		((Veterinario)veterinario3).setCrmv(8125);

		Medicamento medicamento1 = new Medicamento();
		medicamento1.setNome("Amoxilina");
		medicamento1.setFuncao("Antibiótico");
		medicamento1.setFormula("Amoxicila tri-hidratada");
		medicamento1.setVia("Oral ou injetável");
		medicamento1.setDataValidade("1-3 anos");

		Medicamento medicamento2 = new Medicamento();
		medicamento2.setNome("Meloxicam");
		medicamento2.setFuncao("Anti-inflamatório");
		medicamento2.setFormula("Meloxicam");
		medicamento2.setVia("Oral");
		medicamento2.setDataValidade("1-3 anos");

		Medicamento medicamento3 = new Medicamento();
		medicamento3.setNome("Pamoato de Pirantel");
		medicamento3.setFuncao("Antiparasitário interno");
		medicamento3.setFormula("Pamoato de Pirantel");
		medicamento3.setVia("Oral");
		medicamento3.setDataValidade("1-3 anos");

		Medicamento medicamento4 = new Medicamento();
		medicamento4.setNome("Fipronil");
		medicamento4.setFuncao("Antiparasitário externo");
		medicamento4.setFormula("Fipronil");
		medicamento4.setVia("Tópica");
		medicamento4.setDataValidade("1-3 anos");

		Medicamento medicamento5 = new Medicamento();
		medicamento5.setNome("Ketamina");
		medicamento5.setFuncao("Anestésico");
		medicamento5.setFormula("Cloridrato de Ketamina");
		medicamento5.setVia("Injetável");
		medicamento5.setDataValidade("1-3 anos");

		Animal sapo4 = new Anfibio();
		sapo4.setNome("Sapo");
		sapo4.setNomeCientifico("Anura");
		sapo4.setSexo("Macho");

		Animal pinguim3 = new Ave();
		pinguim3.setNome("Pinguim");
		pinguim3.setNomeCientifico("Spheniscidae");
		pinguim3.setSexo("Fêmea");

		Animal leao3 = new Mamifero();
		leao3.setNome("Leão");
		leao3.setNomeCientifico("Panthera leo");
		leao3.setSexo("Fêmea");

		Animal tubarao3 = new Peixe();
		tubarao3.setNome("Tubarão");
		tubarao3.setNomeCientifico("Selachimorpha");
		tubarao3.setSexo("Macho");

		Animal cobra3 = new Reptil();
		cobra3.setNome("Cobra");
		cobra3.setNomeCientifico("Serpentidae");
		cobra3.setSexo("Fêmea");

		List <Funcionario> setorAdministrativo = new ArrayList <Funcionario>();

		setorAdministrativo.add(funcionario1);
		setorAdministrativo.add(funcionario2);
		setorAdministrativo.add(funcionario3);
		setorAdministrativo.add(funcionario4);

		List <Funcionario> setorServGerais = new ArrayList <Funcionario>();

		setorServGerais.add(funcionario5);
		setorServGerais.add(funcionario6);
		setorServGerais.add(funcionario7);
		setorServGerais.add(funcionario8);

		List <Funcionario> atendentesVet = new ArrayList <Funcionario>();

		atendentesVet.add(funcionario9);
		atendentesVet.add(funcionario10);

		List <Funcionario> atendentesBio = new ArrayList <Funcionario>();

		atendentesBio.add(funcionario11);
		atendentesBio.add(funcionario12);

		List <Veterinario> veterinarios = new ArrayList <Veterinario>();

		veterinarios.add((Veterinario) veterinario1);
		veterinarios.add((Veterinario) veterinario2);
		veterinarios.add((Veterinario) veterinario3);

		List <Biologo> biologos = new ArrayList <Biologo>();

		biologos.add((Biologo) biologo1);
		biologos.add((Biologo) biologo2);
		biologos.add((Biologo) biologo3);

		List <Medicamento> medicamentos = new ArrayList <Medicamento>();

		medicamentos.add(medicamento1);
		medicamentos.add(medicamento2);
		medicamentos.add(medicamento3);
		medicamentos.add(medicamento4);
		medicamentos.add(medicamento5);

		List <Animal> animaisDoentes = new ArrayList <Animal>();

		animaisDoentes.add(sapo4);
		animaisDoentes.add(pinguim3);
		animaisDoentes.add(leao3);
		animaisDoentes.add(tubarao3);
		animaisDoentes.add(cobra3);

		Setor administracao = new Administracao();
		administracao.setNomeSetor("Administração");
		administracao.setFuncionarios(setorAdministrativo);

		Setor biologia = new Biologia();
		biologia.setNomeSetor("Biologia");
		biologia.setFuncionarios(atendentesBio);
		((Biologia)biologia).setBiologos(biologos);


		Setor servicosGerais = new ServicosGerais();
		servicosGerais.setNomeSetor("Serviços Gerais");
		servicosGerais.setFuncionarios(setorServGerais);

		Setor clinicaVeterinaria = new ClinicaVeterinaria();
		clinicaVeterinaria.setNomeSetor("Clinica Veterinária");
		clinicaVeterinaria.setFuncionarios(atendentesVet);
		((ClinicaVeterinaria)clinicaVeterinaria).setVeterinarios(veterinarios);
		((ClinicaVeterinaria)clinicaVeterinaria).setMedicamentos(medicamentos);
		((ClinicaVeterinaria)clinicaVeterinaria).setAnimaisDoentes(animaisDoentes);

		List <Setor> setores = new ArrayList <Setor>();

		setores.add(administracao);
		setores.add(biologia);
		setores.add(servicosGerais);
		setores.add(clinicaVeterinaria);

		for (Setor setoresZoo : setores) {
			System.out.println("--------------------------------------------");
			System.out.println("Nome do setor: " + setoresZoo.getNomeSetor());
			System.out.println("--------------------------------------------");

			for (Funcionario funcionariosZoo : setoresZoo.getFuncionarios()) {
				System.out.println("Nome: " + funcionariosZoo.getNome());
				System.out.println("Cargo: " + funcionariosZoo.getCargo());
				System.out.println("CPF: " + funcionariosZoo.getCpf());
				System.out.printf("Salário: R$%.2f\n", funcionariosZoo.getSalario());
				System.out.println("--------------------------------------------");
			}

			if(setoresZoo instanceof ClinicaVeterinaria) {	
				((ClinicaVeterinaria) setoresZoo).listarMedicamentos();
				((ClinicaVeterinaria) setoresZoo).listarAnimaisDoentes();	
			}
			
			if (setoresZoo instanceof Administracao) {
				((Administracao) setoresZoo).pagarFuncionario();
			}

		}

	}

}

