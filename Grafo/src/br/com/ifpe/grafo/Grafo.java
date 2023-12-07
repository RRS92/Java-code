package br.com.ifpe.grafo;

public class Grafo {
	int numVertices ;
	int[][] matrizAdja;

	
	public void criarGrafo(int numVertice) {
		this.numVertices = numVertice;
		matrizAdja = new int[numVertice][numVertice];

	}

	
	public void inserirAresta(int vertOrigem, int vertDestino) {
		matrizAdja[vertOrigem-1][vertDestino-1] = 1;
		matrizAdja[vertDestino-1][vertOrigem-1] = 1;
	}
	
	
	public boolean verificarAresta(int vertOrigem, int vertDestino) throws MyException {
		if (vertOrigem <= 0 || numVertices < vertOrigem || vertDestino <= 0 || numVertices < vertDestino) {
			throw new MyException("Índices fora dos limites");
		}
		return matrizAdja[vertOrigem-1][vertDestino-1] == 1;
	}
	

	public void mostrarVerticesRelacionadas(int vertice) throws MyException {
		if (vertice < 0 || numVertices < vertice || vertice < 0 || numVertices < vertice) {
			throw new MyException("Índices fora dos limites");
		}
		for (int i = 0; i < numVertices; i++) {
			if (matrizAdja[vertice-1][i] == 1) {
				System.out.println(vertice + " -> " + (i + 1));
			}
		}
	}
	
	
	public void removerAresta(int vertOrigem, int vertDestino) throws MyException {
	    if (vertOrigem <= 0 || numVertices < vertOrigem || vertDestino <= 0 || numVertices < vertDestino) {
	        throw new MyException("Índices fora dos limites");
	    }
	    if (matrizAdja[vertOrigem-1][vertDestino-1] == 0) {
	        throw new MyException("Aresta sem ligacao");
	    }
	    matrizAdja[vertOrigem-1][vertDestino-1] = 0;
        matrizAdja[vertDestino-1][vertOrigem-1] = 0;
	}
	

	public void imprimirMatrizadjascente() {
		for (int i = 0; i < numVertices; i++) {
			for (int o = 0; o < numVertices; o++) {
				System.out.printf("%2d | ", matrizAdja[i][o]);

			}
			System.out.printf("%n");
		}
	}
		
	
	public void imprimirVerticesEArestas() {
	    System.out.println("Vertices e Arestas:");
	    System.out.print("V = { ");
	    for (int i = 0; i < numVertices; i++) {
	        System.out.print((i + 1) + (i == numVertices - 1 ? "" : ", "));
	    }
	    System.out.println("}");

	    System.out.print("E = { ");
	    boolean primeiraAresta = true;
	    for (int i = 0; i < numVertices; i++) {
	        for (int j = i + 1; j < numVertices; j++) {
	            if (matrizAdja[i][j] == 1) {
	                if (!primeiraAresta) {
	                    System.out.print(", ");
	                }
	                System.out.print("(" + (i + 1) + "," + (j + 1) + ")");
	                primeiraAresta = false;
	            }
	        }
	    }
	    System.out.println(" }");
	    System.out.println();
	}

	
	public void quantVertices() {
	    int quantVertices = 0;
	    for (int vertice = 0; vertice < numVertices; vertice++) {
	        quantVertices++;
	    }
	    System.out.println("Quantidade de vértices no grafo: " + quantVertices);
	    System.out.print("V = { ");
	    for (int i = 0; i < numVertices; i++) {
	        System.out.print((i + 1) + (i == numVertices - 1 ? "" : ", "));
	    }
	    System.out.println("}");
	}

}

