package br.com.ifpe.AVL;

public class No<T> {
    T elemento;
    No<T> Esquerda;
    No<T> Direita;
    int altura;

    public No(T elemento) {
        this.elemento = elemento;
        this.Esquerda = null;
        this.Direita = null;
        this.altura = 1;
    }
}