package atv;

public class AppMain {

	public static void main(String[] args) throws MyException{
		
		
			SearchBinaryTree<Integer> arvore = new SearchBinaryTree<Integer>();
			arvore.insert(5);
			arvore.insert(2);
			arvore.insert(17);
			arvore.insert(45);
			arvore.insert(38);
			arvore.insert(71);
			arvore.insert(4);
			arvore.insert(9);
			arvore.insert(1);
			//arvore.insert(null);

			//System.out.println("Elementos da árvore em ordem:");
	        //arvore.inOrder();
	        
	        //System.out.println("\nElementos da árvore em pré-ordem:");
	        //arvore.preOrder();
	        
	        //System.out.println("\nElementos da árvore em pós-ordem:");
	        //arvore.posOrder();
	        
			//System.out.println("\nOrdenação por level: ");
	        //arvore.levelOrder();
	        
	        //System.out.println("\nElemento de menor valor: ");
	        //arvore.min();
	        
	        //System.out.println("\nElemento de maior valor: ");
	       // arvore.max();
	        
	        
	}

}
