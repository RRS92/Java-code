package br.com.ifpe.SearchBinaryTree;

public class Main {

	public static void main(String[] args) throws MyException  {
		 SearchBinaryTree<Integer> tree = new SearchBinaryTree<Integer>();

	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(70);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(60);
	        tree.insert(80);

	        System.out.println("Árvore após inserção:");
	        tree.inOrder(); 

	        Integer elementToRemove = 50;
	        tree.remove(elementToRemove);

	        System.out.println("\nÁrvore após a remoção de " + elementToRemove + ":");
	        tree.inOrder(); 


	}

}
