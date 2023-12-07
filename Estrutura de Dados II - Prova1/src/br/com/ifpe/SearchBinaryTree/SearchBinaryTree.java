package br.com.ifpe.SearchBinaryTree;

public class SearchBinaryTree <T extends Comparable<T>>{
	NodeSBT<T> root;
	
	public void insert(T e) throws MyException{
		insert(this.root, e);
	}

	public void insert(NodeSBT<T> node, T element) throws MyException{
		if (element == null) {
			throw new MyException("O valor inserido é inválido");
		}
		if (this.root == null) {
			this.root = new NodeSBT<T>(element);
		} else {
			if (element.compareTo(node.elemento) < 0) {
				if (node.left != null) {
					insert(node.left, element);
				} else {
					node.left = new NodeSBT<T>(element);
				}
			} else if (element.compareTo(node.elemento) > 0) {
				if (node.right != null) {
					insert(node.right, element);
				} else {
					node.right = new NodeSBT<T>(element);
				}
			} 
		}
	}
	
	public void remove(T element) throws MyException{
	    if (element == null) {
	    	throw new MyException("O valor inserido é inválido");
	    }
	    this.root = remove(root, element);
	}
	

	private NodeSBT<T> remove(NodeSBT<T> node, T element) {
	    if (node == null) {

	        return node;
	    }

	    if (element.compareTo(node.elemento) < 0) {

	        node.left = remove(node.left, element);
	    } else if (element.compareTo(node.elemento) > 0) {

	        node.right = remove(node.right, element);
	    } else {

	        if (node.left == null) {
	            return node.right;
	        } else if (node.right == null) {
	            return node.left;
	        }

	        node.elemento = minValue(node.right);

	        node.right = remove(node.right, node.elemento);
	    }

	    return node;
	}

	
	private T minValue(NodeSBT<T> node) {
	    T minValue = node.elemento;
	    while (node.left != null) {
	        minValue = node.left.elemento;
	        node = node.left;
	    }
	    return minValue;
	}
	
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(NodeSBT<T> node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.elemento + " ");
			inOrder(node.right);
		}
	}

}
