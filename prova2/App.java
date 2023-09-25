package prova2;

import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		List <Desenho> listaDesenhos = new ArrayList <Desenho>();
		
		Desenho desenho1 = new Desenho();
        Desenho desenho2 = new Desenho();
        
        Forma triangulo1 = new Triangulo(5, 3);
        Forma retangulo1 = new Retangulo(4, 2);
        
        desenho1.adicionarForma(triangulo1);
        desenho1.adicionarForma(retangulo1);
        
        Forma triangulo2 = new Triangulo(5, 3);
        Forma quadrado2 = new Quadrado(4);
        
        desenho2.adicionarForma(triangulo2);
        desenho2.adicionarForma(quadrado2);
        
        listaDesenhos.add(desenho1);
        listaDesenhos.add(desenho2);
        
        desenho1.calcularAreaTotal();
        desenho2.calcularAreaTotal();
        
        for (Desenho desenho : listaDesenhos) {
        	desenho.calcularAreaTotal();
        	for (Forma des : desenho1.getFormas()) {
        		if(des instanceof Triangulo) {
        			desenho.calcularAreaTotal();
        			System.out.println("Triangulo");
        		}
			}
		}
	}

}
