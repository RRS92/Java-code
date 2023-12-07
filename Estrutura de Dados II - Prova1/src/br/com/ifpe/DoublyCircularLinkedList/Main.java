package br.com.ifpe.DoublyCircularLinkedList;

public class Main {
	public static void main(String[] args) throws MyException {
		
		DoublyCircularLinkedList<Integer> list2 = new DoublyCircularLinkedList<>();
        list2.insert(0, 1);
        list2.insert(1, 2);
        list2.insert(2, 3);
        list2.display(); 

        list2.remove(1);
        list2.display(); 
	}

}
