package ATV;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CarrinhoComprasSite {
    public static void main(String[] args) {
        List<String> listaDuplamenteEncadeada = new LinkedList<>();

        listaDuplamenteEncadeada.add("Camisa social masculina");
        listaDuplamenteEncadeada.add("Cinto de couro");
        listaDuplamenteEncadeada.add("Meias masculina");

        System.out.println("Seu carrinho de compras: \n");
        for (String item : listaDuplamenteEncadeada) {
            System.out.print(item + "\n");
        }
        System.out.println();
        
        ListIterator<String> iterator = listaDuplamenteEncadeada.listIterator();
        
        String removerItem = "Cinto de couro";

        while (iterator.hasNext()) {
            if (iterator.next() == removerItem) {
                iterator.remove();
                System.out.println("Item  "+ removerItem + " removido com sucesso! \n");
            }
        }

        System.out.println("Seu carrinho de compras: \n");
        for (String item : listaDuplamenteEncadeada) {
            System.out.print(item + "\n");
        }
        System.out.println();
    }
}
