package br.com.ifpe.AVL;

public class AppPrincipal {

	public static void main(String[] args) throws MyException {
		
		try {
	        AVL<Integer> avl = new AVL<Integer>();
	        avl.inserir(10);
	        avl.inserir(3);
	        avl.inserir(2);
	        avl.inserir(5);
	        avl.inserir(7);
	        avl.inserir(6);


	        System.out.println("PreOrder AVL: ");
	        avl.preOrder();
	        System.out.println();
	        
	        System.out.println();
	        System.out.println("Balanceamento dos nós: ");
	        avl.printBalanceamento();
	        System.out.println();
	        
	        int NoRemovido = 5;
	        avl.remover(NoRemovido);
	        System.out.println("Nó removido: " + NoRemovido);
	        System.out.println();
	        
	        System.out.println("PreOrder após a remoção: ");
	        avl.preOrder();
	        System.out.println();
	        
	        System.out.println();
	        System.out.println("Balanceamento dos nós após a remoção: ");
	        avl.printBalanceamento();
	        System.out.println();
	        
	        
	    } catch (MyException e) {
	        System.err.println("Erro: " + e.getMessage());
	    }

	}

}
