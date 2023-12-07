package atv;

import java.util.Queue;
import java.util.LinkedList;

public class SearchBinaryTree<T extends Comparable<T>>  {
	Node<T> root;
	
	public void insert(T e) throws MyException{
		insertRec(this.root, e);
	}

	public void insertRec(Node<T> node, T element)throws MyException{
		if (element == null) {
			throw new MyException("O valor inserido é inválido");
		}
		if (this.root == null) {
			this.root = new Node<T>(element);
		} else {
			if (element.compareTo(node.elemento) < 0) {
				if (node.Esquerda != null) {
					insertRec(node.Esquerda, element);
				} else {
					node.Esquerda = new Node<T>(element);
				}
			} else if (element.compareTo(node.elemento) > 0) {
				if (node.Direita != null) {
					insertRec(node.Direita, element);
				} else {
					node.Direita = new Node<T>(element);
				}
			} 
		}
	}

	public void inOrder() {
		inOrderRec(root);
	}

	public void inOrderRec(Node<T> node) {
		if (node != null) {
			inOrderRec(node.Esquerda);
			System.out.print(node.elemento + " ");
			inOrderRec(node.Direita);
		}
	}
	
	public void preOrder() {
	    preOrderRec(root);
	}

	private void preOrderRec(Node<T> node) {
	    if (node != null) {
	        System.out.print(node.elemento + " ");
	        preOrderRec(node.Esquerda);
	        preOrderRec(node.Direita);
	    }
	}
	
	public void posOrder() {
        posOrderRec(root);
    }

    private void posOrderRec(Node<T> node) {
        if (node != null) {
            posOrderRec(node.Esquerda);
            posOrderRec(node.Direita);
            System.out.print(node.elemento + " ");
        }
    }
    
    public void min() {
        minRec(root);
    }
        
    private void minRec(Node<T> node) {
        if (node.Esquerda == null) {
        	System.out.println(node.elemento);;
        }
        else minRec(node.Esquerda);
    }

    
    public void max(){
    	maxRec(root);
    }
    
    public void maxRec(Node<T> node){
    	if (node.Direita == null) {
    		System.out.println(node.elemento);
    	}
    	else maxRec(node.Direita);
    }
    
    
    public void levelOrder() {
        if (root == null) return;

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node <T> current = queue.poll();
            System.out.print(current.elemento + " ");

            if (current.Esquerda != null)
                queue.add(current.Esquerda);

            if (current.Direita != null)
                queue.add(current.Direita);
        }
    }
}


