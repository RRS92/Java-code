package prova2;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
	private List <Forma> formas;
	
	public Desenho() {
        this.formas = new ArrayList<>();
    }

	public void adicionarForma(Forma forma) {
        formas.add(forma);
    }
	
	public Desenho(List<Forma> formas) {
		super();
		this.formas = formas;
	}

	public List<Forma> getFormas() {
		return formas;
	}

	public void setFormas(List<Forma> formas) {
		this.formas = formas;
	}
	
	public double calcularAreaTotal() {
		double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
