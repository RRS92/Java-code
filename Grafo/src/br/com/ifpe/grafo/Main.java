package br.com.ifpe.grafo;

public class Main {
	public static void main(String[] args) {
		try {
			Grafo grafo = new Grafo();

			grafo.criarGrafo(6);
			grafo.inserirAresta(1, 2);
			grafo.inserirAresta(1, 4);
			grafo.inserirAresta(2, 3);
			grafo.inserirAresta(2, 6);
			grafo.inserirAresta(3, 4);
			grafo.inserirAresta(5, 4);

			System.out.println();
			
			grafo.imprimirVerticesEArestas();

			System.out.println("Matriz do Grafo: ");
			grafo.imprimirMatrizadjascente();
			System.out.println();

			
			int origem = 2, destino = 4;
			System.out.print("Verificando aresta existente: (" + origem + "," + destino+ ") = ");
			System.out.println(grafo.verificarAresta(origem, destino));
			System.out.println();

			
			int vert1 = 2;
			System.out.println("Verificando vertices relacionadas: " + vert1);
			grafo.mostrarVerticesRelacionadas(vert1);
			System.out.println();
			
			
			int remOrigem = 2, remDestino = 6;
			System.out.println("remover aresta : (" + remOrigem + "," + remDestino + ")");
			grafo.removerAresta(remOrigem, remDestino);
			System.out.println();
			
			
			int vert2 = 2;
			System.out.println("Verificando vertices relacionadas: " + vert2);
			grafo.mostrarVerticesRelacionadas(vert2);
			System.out.println();
			
			
			grafo.imprimirVerticesEArestas();

			System.out.println("Matriz do Grafo após remoção: ");
			grafo.imprimirMatrizadjascente();

			System.out.println();
			grafo.quantVertices();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
