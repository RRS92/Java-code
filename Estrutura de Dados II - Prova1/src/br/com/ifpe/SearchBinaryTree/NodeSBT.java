package br.com.ifpe.SearchBinaryTree;

public class NodeSBT <T>{
	T elemento;
	NodeSBT<T> left;
	NodeSBT<T> right;

	public NodeSBT(T elemento) {
        super();
        this.elemento = elemento;
        this.left = null;
        this.right = null;
    }

}
