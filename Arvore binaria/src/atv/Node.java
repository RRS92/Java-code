package atv;

public class Node<T>  {
	T elemento;
	Node<T> Esquerda;
	Node<T> Direita;

	public Node(T elemento) {
        super();
        this.elemento = elemento;
        this.Esquerda = null;
        this.Direita = null;
    }

}
