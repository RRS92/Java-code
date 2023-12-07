package ATV;

import java.util.Stack;

public class HistoricoSite {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Página Inicial");
        pilha.push("Página do produto");
        pilha.push("Carrinho de Compra");

        System.out.println("Página atual: " + pilha.peek() + "\n");
        
        System.out.println("<-- Voltar para a página anterior \n");
        pilha.pop();

        System.out.println("Página atual: " + pilha.peek() + "\n");
        
        System.out.println("<-- Voltar para a página anterior \n");
        pilha.pop();

        System.out.println("Página atual: " + pilha.peek());

    }
}
