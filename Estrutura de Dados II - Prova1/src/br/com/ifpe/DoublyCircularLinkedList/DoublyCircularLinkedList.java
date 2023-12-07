package br.com.ifpe.DoublyCircularLinkedList;

public class DoublyCircularLinkedList<T> {
	private NodeDCLL<T> head;
    private int size;

    public DoublyCircularLinkedList() {
        head = null;
        size = 0;
    }

    public void insert(int position, T element) throws MyException {
        if (position < 0 || position > size) {
        	throw new MyException("Posição fora dos limites da lista.");
        }

        NodeDCLL<T> newNode = new NodeDCLL<>(element);

        if (isEmpty()) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else if (position == 0) {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else {
        	NodeDCLL<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++;
    }

    public void remove(int position) throws MyException{
        if (isEmpty()) {
        	throw new MyException("A lista está vazia, não é possível remover elementos.");
        }

        if (position < 0 || position >= size) {
        	throw new MyException("Posição fora dos limites da lista.");
        }

        if (size == 1) {
            head = null;
        } else if (position == 0) {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        } else {
        	NodeDCLL<T> current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        NodeDCLL<T> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

}
    }
