package Habitats;

import java.util.List;

import Animais.Animal;

public abstract class Habitat {
	
	private double area;
	private List<Animal> animais;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public List<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
}

