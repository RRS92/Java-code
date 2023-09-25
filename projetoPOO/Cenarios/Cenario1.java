package Cenarios;

import java.util.List;
import java.util.ArrayList;

import Animais.Animal;
import Animais.Anfibio;
import Animais.Ave;
import Animais.Mamifero;
import Animais.Peixe;
import Animais.Reptil;

import Habitats.Habitat;
import Habitats.Aquatico;
import Habitats.Terrestre;
import Habitats.Hibrido;

public class Cenario1 {

	public static void main(String[] args) {

		// Primeiro HABITAT
		Animal elefante1 = new Mamifero();
		elefante1.setNome("Elefante");
		elefante1.setNomeCientifico("Loxodonta");
		elefante1.setFamilia("Elephantidae");
		elefante1.setOrdem("Proboscidea");
		elefante1.setAlimentação("Plantas");
		elefante1.setHora(2);
		elefante1.setSexo("Macho");
		elefante1.setCuriosidade("Os elefantes possuem 4 joelhos!");

		Animal elefante2 = new Mamifero();
		elefante2.setNome("Elefoa");
		elefante2.setNomeCientifico("Loxodonta");
		elefante2.setFamilia("Elephantidae");
		elefante2.setOrdem("Proboscidea");
		elefante2.setAlimentação("Plantas");
		elefante2.setHora(2);
		elefante2.setSexo("Fêmea");
		elefante2.setCuriosidade("Os elefantes podem viver por 70 anos!");

		List <Animal> elefantes = new ArrayList<Animal>();
		elefantes.add(elefante1);
		elefantes.add(elefante2);

		Habitat habitat1 = new Hibrido();
		habitat1.setArea(150);
		habitat1.setAnimais(elefantes);
		((Hibrido)habitat1).setTipoTerreno("Terra");
		((Hibrido)habitat1).setTipoAgua("Doce");
		((Hibrido)habitat1).setVolume(50);


		// Segundo Habitat
		Animal leao1 = new Mamifero();
		leao1.setNome("Leão");
		leao1.setNomeCientifico("Panthera leo");
		leao1.setFamilia("Felidae");
		leao1.setOrdem("Carnivora");
		leao1.setAlimentação("Carne");
		leao1.setHora(16);
		leao1.setSexo("Macho");
		leao1.setCuriosidade("Leão pode dar salto de 10 m!");

		Animal leao2 = new Mamifero();
		leao2.setNome("Leoa");
		leao2.setNomeCientifico("Panthera leo");
		leao2.setFamilia("Felidae");
		leao2.setOrdem("Carnivora");
		leao2.setAlimentação("Carne");
		leao2.setHora(16);
		leao2.setSexo("Fêmea");
		leao2.setCuriosidade("A leoa tem o período gestacional de 110 dias");

		List <Animal> leoes = new ArrayList<Animal>();
		leoes.add(leao1);
		leoes.add(leao2);

		Habitat habitat2 = new Terrestre();
		habitat2.setArea(75);
		habitat2.setAnimais(leoes);
		((Terrestre)habitat2).setTipoTerreno("Terra");


		// Terceiro HABITAT
		Animal girafa1 = new Mamifero();
		girafa1.setNome("Girafa");
		girafa1.setNomeCientifico("Giraffa");
		girafa1.setFamilia("Giraffidae");
		girafa1.setOrdem("Artiodactyla");
		girafa1.setAlimentação("Plantas");
		girafa1.setHora(5);
		girafa1.setSexo("Macho");
		girafa1.setCuriosidade("Girafas São os animais mais altos do mundo!");

		Animal girafa2 = new Mamifero();
		girafa2.setNome("Girafa");
		girafa2.setNomeCientifico("Giraffa");
		girafa2.setFamilia("Giraffidae");
		girafa2.setOrdem("Artiodactyla");
		girafa2.setAlimentação("Plantas");
		girafa2.setHora(5);
		girafa2.setSexo("Fêmea");
		girafa2.setCuriosidade("Girafas Têm a língua azul!");

		List <Animal> girafas = new ArrayList<Animal>();
		girafas.add(girafa1);
		girafas.add(girafa2);

		Habitat habitat3 = new Terrestre();
		habitat3.setArea(80);
		habitat3.setAnimais(girafas);
		((Terrestre)habitat3).setTipoTerreno("Terra");


		// Quarto HABITAT
		Animal pinguim1 = new Ave();
		pinguim1.setNome("Pinguim");
		pinguim1.setNomeCientifico("Spheniscidae");
		pinguim1.setFamilia("Spheniscidae");
		pinguim1.setOrdem("Sphenisciformes");
		pinguim1.setAlimentação("Peixes");
		pinguim1.setHora(6);
		pinguim1.setSexo("Macho");
		pinguim1.setCuriosidade("Pinguins são encontrados apenas no Hemisfério Sul!");

		Animal pinguim2 = new Ave();
		pinguim2.setNome("Pinguim");
		pinguim2.setNomeCientifico("Spheniscidae");
		pinguim2.setFamilia("Spheniscidae");
		pinguim2.setOrdem("Sphenisciformes");
		pinguim2.setAlimentação("Peixes");
		pinguim2.setHora(6);
		pinguim2.setSexo("Fêmea");
		pinguim2.setCuriosidade("Pinguins são monogâmicos!");

		List <Animal> pinguins = new ArrayList<Animal>();
		pinguins.add(pinguim1);
		pinguins.add(pinguim2);

		Habitat habitat4 = new Hibrido();
		habitat4.setArea(30);
		habitat4.setAnimais(pinguins);
		((Hibrido)habitat4).setTipoTerreno("neve");
		((Hibrido)habitat4).setTipoAgua("Salgada");
		((Hibrido)habitat4).setVolume(65);


		// Quinto HABITAT
		Animal aguia1 = new Ave();
		aguia1.setNome("Aguia");
		aguia1.setNomeCientifico("Aquila chrysaetos");
		aguia1.setFamilia("Accipitridae");
		aguia1.setOrdem("Accipitriformes");
		aguia1.setAlimentação("carne");
		aguia1.setHora(0);
		aguia1.setSexo("Macho");
		aguia1.setCuriosidade("As águias são uma das maiores aves do planeta!");

		Animal aguia2 = new Ave();
		aguia2.setNome("Aguia");
		aguia2.setNomeCientifico("Aquila chrysaetos");
		aguia2.setFamilia("Accipitridae");
		aguia2.setOrdem("Accipitriformes");
		aguia2.setAlimentação("carne");
		aguia2.setHora(0);
		aguia2.setSexo("FÊmea");
		aguia2.setCuriosidade("A visão de uma águia é cerca de 5 vezes melhor do que a visão humana!");

		List <Animal> aguias = new ArrayList<Animal>();
		aguias.add(aguia1);
		aguias.add(aguia2);

		Habitat habitat5 = new Terrestre();
		habitat5.setArea(18);
		habitat5.setAnimais(aguias);
		((Terrestre)habitat5).setTipoTerreno("Terra");


		// Sexto HABITAT
		Animal cobra1 = new Reptil();
		cobra1.setNome("Cobra");
		cobra1.setNomeCientifico("Serpentidae");
		cobra1.setFamilia("Serpentidae");
		cobra1.setOrdem("Squamata");
		cobra1.setAlimentação("carne");
		cobra1.setHora(18);
		cobra1.setSexo("Macho");
		cobra1.setCuriosidade("Algumas Cobras são venenosas e outras não!");

		Animal cobra2 = new Reptil();
		cobra2.setNome("Cobra");
		cobra2.setNomeCientifico("Serpentidae");
		cobra1.setFamilia("Serpentidae");
		cobra2.setOrdem("Squamata");
		cobra2.setAlimentação("carne");
		cobra2.setHora(18);
		cobra2.setSexo("Fêmea");
		cobra2.setCuriosidade("Cobras possuem sentidos são surpreendentes!");

		List <Animal> cobras = new ArrayList<Animal>();
		cobras.add(cobra1);
		cobras.add(cobra2);

		Habitat habitat6 = new Hibrido();
		habitat6.setArea(50);
		habitat6.setAnimais(cobras);
		((Hibrido)habitat6).setTipoTerreno("Terra");
		((Hibrido)habitat6).setTipoAgua("Doce");
		((Hibrido)habitat6).setVolume(35);


		// Sétimo HABITAT
		Animal lagarto1 = new Reptil();
		lagarto1.setNome("Lagarto");
		lagarto1.setNomeCientifico("Lacertilia");
		lagarto1.setFamilia("Lacertidae");
		lagarto1.setOrdem("Squamata");
		lagarto1.setAlimentação("tudo");
		lagarto1.setHora(12);
		lagarto1.setSexo("Macho");
		lagarto1.setCuriosidade("Existem lagartos que soltam a cauda quando se sentem ameaçados!");

		Animal lagarto2 = new Reptil();
		lagarto2.setNome("Lagarto");
		lagarto2.setNomeCientifico("Lacertilia");
		lagarto2.setFamilia("Lacertidae");
		lagarto2.setOrdem("Squamata");
		lagarto2.setAlimentação("tudo");
		lagarto2.setHora(12);
		lagarto2.setSexo("Fêmea");
		lagarto2.setCuriosidade("O dragão-de-komodo é o maior lagarto do mundo!");

		List <Animal> lagartos = new ArrayList<Animal>();
		lagartos.add(lagarto1);
		lagartos.add(lagarto2);

		Habitat habitat7 = new Hibrido();
		habitat7.setArea(50);
		habitat7.setAnimais(lagartos);
		((Hibrido)habitat7).setTipoTerreno("Terra");
		((Hibrido)habitat7).setTipoAgua("Doce");
		((Hibrido)habitat7).setVolume(35);


		// Oitavo HABITAT
		Animal tubarao1 = new Peixe();
		tubarao1.setNome("Tubarão");
		tubarao1.setNomeCientifico("Selachimorpha");
		tubarao1.setFamilia("Lamnidae");
		tubarao1.setOrdem("Carcharhiniformes");
		tubarao1.setAlimentação("carne");
		tubarao1.setHora(0);
		tubarao1.setSexo("Macho");
		tubarao1.setCuriosidade("Quando um tubarão para de nadar, ele afunda!");

		Animal tubarao2 = new Peixe();
		tubarao2.setNome("Tubarão");
		tubarao2.setNomeCientifico("Selachimorpha");
		tubarao2.setFamilia("Lamnidae");
		tubarao2.setOrdem("Carcharhiniformes");
		tubarao2.setAlimentação("carne");
		tubarao2.setHora(0);
		tubarao2.setSexo("Fêmea");
		tubarao2.setCuriosidade("O tubarão-baleia é a maior espécie de tubarão, entretanto, não é um grande predador!");

		Animal peixe1 = new Peixe();
		peixe1.setNome("Peixe");
		peixe1.setNomeCientifico("Pisces");
		peixe1.setFamilia("Pisces");
		peixe1.setOrdem("Pisces");
		peixe1.setAlimentação("tudo");
		peixe1.setHora(0);
		peixe1.setSexo("Macho");
		peixe1.setCuriosidade("Os peixes podem ficar com falta de 'ar'!");

		Animal peixe2 = new Peixe();
		peixe2.setNome("Peixe");
		peixe2.setNomeCientifico("Pisces");
		peixe2.setFamilia("Pisces");
		peixe2.setOrdem("Pisces");
		peixe2.setAlimentação("tudo");
		peixe2.setHora(0);
		peixe2.setSexo("Fêmea");
		peixe2.setCuriosidade("Peixes Betta conseguem respirar ar atmosférico!");

		Animal peixe3 = new Peixe();
		peixe3.setNome("Peixe");
		peixe3.setNomeCientifico("Pisces");
		peixe3.setFamilia("Pisces");
		peixe3.setOrdem("Pisces");
		peixe3.setAlimentação("tudo");
		peixe3.setHora(0);
		peixe3.setSexo("Macho");
		peixe3.setCuriosidade("Os peixes dificilmente morrem pela boca!");

		Animal peixe4 = new Peixe();
		peixe4.setNome("Peixe");
		peixe4.setNomeCientifico("Pisces");
		peixe4.setFamilia("Pisces");
		peixe4.setOrdem("Pisces");
		peixe4.setAlimentação("tudo");
		peixe4.setHora(0);
		peixe4.setSexo("Fêmea");
		peixe4.setCuriosidade("Todo peixe-palhaço nasce macho!");

		List <Animal> peixes = new ArrayList<Animal>();
		peixes.add(peixe1);
		peixes.add(peixe2);
		peixes.add(peixe3);
		peixes.add(peixe4);
		peixes.add(tubarao1);
		peixes.add(tubarao2);

		Habitat aquario = new Aquatico();
		aquario.setArea(75);
		aquario.setAnimais(peixes);
		((Aquatico)aquario).setTipoAgua("Salgada");
		((Aquatico)aquario).setVolume(150);

		// Nono HABITAT
		Animal sapo1 = new Anfibio();
		sapo1.setNome("Sapo");
		sapo1.setNomeCientifico("Anura");
		sapo1.setFamilia("Bufonidae");
		sapo1.setOrdem("Anura");
		sapo1.setAlimentação("tudo");
		sapo1.setHora(0);
		sapo1.setSexo("Macho");
		sapo1.setCuriosidade("Todos os sapos possuem cordas vocais!");

		Animal sapo2 = new Anfibio();
		sapo2.setNome("Sapo");
		sapo2.setNomeCientifico("Anura");
		sapo2.setFamilia("Bufonidae");
		sapo2.setOrdem("Anura");
		sapo2.setAlimentação("tudo");
		sapo2.setHora(0);
		sapo2.setSexo("Fêmea");
		sapo2.setCuriosidade("Alguns sapos têm chifres");

		Animal sapo3 = new Anfibio();
		sapo3.setNome("Sapo");
		sapo3.setNomeCientifico("Anura");
		sapo3.setFamilia("Bufonidae");
		sapo3.setOrdem("Anura");
		sapo3.setAlimentação("tudo");
		sapo3.setHora(0);
		sapo3.setSexo("Fêmea");
		sapo3.setCuriosidade("SaposSão controladores biológicos!");

		List <Animal> sapos = new ArrayList<Animal>();
		sapos.add(sapo1);
		sapos.add(sapo2);
		sapos.add(sapo3);

		Habitat habitat9 = new Hibrido();
		habitat9.setArea(35);
		habitat9.setAnimais(sapos);
		((Hibrido)habitat9).setTipoTerreno("Terra");
		((Hibrido)habitat9).setTipoAgua("Doce");
		((Hibrido)habitat9).setVolume(30);


		// Lista com todos os HABITATS
		List <Habitat> habitats = new ArrayList<Habitat>();
		habitats.add(habitat1);
		habitats.add(habitat2);
		habitats.add(habitat3);
		habitats.add(habitat4);
		habitats.add(habitat5);
		habitats.add(habitat6);
		habitats.add(habitat7);
		habitats.add(aquario);
		habitats.add(habitat9);

		for (Habitat hab : habitats) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Area do habitat: " + hab.getArea());
			if(hab instanceof Terrestre) {
				System.out.println("Tipo do habitat: Terrestre");
				System.out.println("Tipo do terreno do habitat: " + ((Terrestre)hab).getTipoTerreno());
				System.out.println(" ");
			}
			else if(hab instanceof Aquatico) {
				System.out.println("Tipo do habitat: Aquatico");
				System.out.println("Tipo de água do habitat: " + ((Aquatico)hab).getTipoAgua());
				System.out.println("Volume da água do habitat: " + ((Aquatico)hab).getVolume());
				System.out.println(" ");
			}
			else if(hab instanceof Hibrido) {
				System.out.println("Tipo do habitat: Hibrido");
				System.out.println("Tipo do terreno do habitat: " + ((Hibrido)hab).getTipoTerreno());
				System.out.println("Tipo de água do habitat: " + ((Hibrido)hab).getTipoAgua());
				System.out.println("Volume da água do habitat: " + ((Hibrido)hab).getVolume());
				System.out.println(" ");
			}
			for (Animal animal : hab.getAnimais()) {
				System.out.println("Nome: " + animal.getNome());
				System.out.println("Nome Cientifico: " + animal.getNomeCientifico());
				System.out.println("Familia: " + animal.getFamilia());
				System.out.println("Ordem: " + animal.getOrdem());
				System.out.println("Sexo: " + animal.getSexo());
				animal.Comer();
				animal.Dormir();
				animal.Curiosidade();
				if(animal instanceof Mamifero) {
					((Mamifero) animal).Amamentar();
					System.out.println(" ");
				}
				else if(animal instanceof Ave) {
					((Ave) animal).TrocarPenas();
					System.out.println(" ");
				}
				else if(animal instanceof Reptil) {
					((Reptil) animal).TrocarPele();
					System.out.println(" ");
				}
				else if(animal instanceof Anfibio) {
					((Anfibio) animal).Metamorfose();
					System.out.println(" ");
				}
				else if(animal instanceof Peixe) {
					((Peixe) animal).Nadar();
					System.out.println(" ");
				}
			}
		}

	}

}
