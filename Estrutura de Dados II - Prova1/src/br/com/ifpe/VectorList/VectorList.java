package br.com.ifpe.VectorList;

import java.util.Arrays;

public class VectorList<T> {
	
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public VectorList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void insert(int position, T element) throws MyException {
        if (position < 0 || position > size) {
        	throw new MyException("Posição fora dos limites da lista.");
        }
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size; i > position; i--) {
            elements[i] = elements[i - 1];
        }
        elements[position] = element;
        size++;
    }
    
    
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    
    public T get(int position)  throws MyException {
        if (position < 0 || position >= size) {
        	throw new MyException("Posição fora dos limites da lista.");
            
        }
        return (T) elements[position];
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
