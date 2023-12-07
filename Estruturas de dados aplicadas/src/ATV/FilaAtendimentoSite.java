package ATV;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimentoSite {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.offer(1);
        fila.offer(2);
        fila.offer(3);
        
        while(fila.isEmpty() == false) {
        	System.out.println("Atendimento atual da fila: Cliente Nº " + fila.poll());
        	System.out.println("Produto sendo vendido!");
            if(fila.peek() == null) {
            	System.out.println("Fila Vazia!");
            } 
            else {
            	System.out.println("Próximo atendimento da fila: Cliente Nº " + fila.peek());
            }
            System.out.println("-------------------------------------------- \n");
        }
        
    }
}

