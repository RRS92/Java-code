package br.com.ifpe.AVL;


public class AVL<T extends Comparable<T>> {
	No<T> raiz;
    
    public void inserir(T e) throws MyException {
        raiz = inserirRec(raiz, e);
    }

    private No<T> inserirRec(No<T> no, T e) throws MyException {
    	if (e == null) {
            throw new MyException("O valor inserido é inválido");
        }
    	 if (no == null)
             return (new No<T>(e));

         if (e.compareTo(no.elemento) < 0)
         	no.Esquerda = inserirRec(no.Esquerda, e);
         else if (e.compareTo(no.elemento) > 0)
         	no.Direita = inserirRec(no.Direita, e);
         else
             return no;

         no.altura = 1 + max(alturaAVL(no.Esquerda), alturaAVL(no.Direita));

         int balancemento = getBalance(no);

         if (balancemento > 1 && e.compareTo(no.Esquerda.elemento) < 0)
             return rotacaoDireita(no);

         if (balancemento < -1 && e.compareTo(no.Direita.elemento) > 0)
             return rotacaoEsquerda(no);

         if (balancemento > 1 && e.compareTo(no.Esquerda.elemento) > 0)
             return rotacaoDuplaDireita(no);

         if (balancemento < -1 && e.compareTo(no.Direita.elemento) < 0)
             return rotacaoDuplaEsquerda(no);

         return no;
    }


    
    public void remover(T elemento) throws MyException {
    	if (elemento == null) {
	    	throw new MyException("O valor inserido é inválido");
	    }
        raiz = removerRec(raiz, elemento);
    }

    private No<T> removerRec(No<T> no, T e) throws MyException {
        if (no == null) {
            return no;
        }
        if (e.compareTo(no.elemento) < 0) {
            no.Esquerda = removerRec(no.Esquerda, e);
        } else if (e.compareTo(no.elemento) > 0) {
            no.Direita = removerRec(no.Direita, e);
        } else {
            if (no.Esquerda == null) {
                return no.Direita;
            } else if (no.Direita == null) {
                return no.Esquerda;
            } else {
                No<T> sucessor = AcharMin(no.Direita);
                no.elemento = sucessor.elemento;
                no.Direita = removerRec(no.Direita, sucessor.elemento);
            }
        }

        no.altura = max(alturaAVL(no.Esquerda), alturaAVL(no.Direita)) + 1;

        int balancemento = getBalance(no);

        if (balancemento > 1 && getBalance(no.Esquerda) >= 0)
            return rotacaoDireita(no);

        if (balancemento > 1 && getBalance(no.Esquerda) < 0) {
            return rotacaoDuplaDireita(no);
        }

        if (balancemento < -1 && getBalance(no.Direita) <= 0)
            return rotacaoEsquerda(no);

        if (balancemento < -1 && getBalance(no.Direita) > 0) {
            return rotacaoDuplaEsquerda(no);
        }

        return no;
    }
    
    
    
    private No<T> AcharMin(No<T> no) {
        while (no.Esquerda != null) {
            no = no.Esquerda;
        }
        return no;
    }
    
    
    
    public void preOrder() {
        preOrderRec(raiz);
    }

    private void preOrderRec(No<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.elemento + " ");
            preOrderRec(raiz.Esquerda);
            preOrderRec(raiz.Direita);
        }
    }
    
//---------------------------------------------------------------------------//
    
    private int alturaAVL(No<T> no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }
    
    
    
    private int max(int a, int b) {
    	return (a > b) ? a : b;
    }

    
    
    private No<T> rotacaoEsquerda(No<T> y) {
    	if (y == null || y.Direita == null) {
            return y;
        }
        No<T> x = y.Direita;
        No<T> T2 = x.Esquerda;

        x.Esquerda = y;
        y.Direita = T2;

        y.altura = max(alturaAVL(y.Esquerda), alturaAVL(y.Direita)) + 1;
        x.altura = max(alturaAVL(x.Esquerda), alturaAVL(x.Direita)) + 1;

        return x;
    }
    

    
    private No<T> rotacaoDireita(No<T> x) {
    	if (x == null || x.Esquerda == null) {
            return x;
        }
        No<T> y = x.Esquerda;
        No<T> T2 = y.Direita;

        y.Direita = x;
        x.Esquerda = T2;

        x.altura = max(alturaAVL(x.Esquerda), alturaAVL(x.Direita)) +1;
        y.altura = max(alturaAVL(y.Esquerda), alturaAVL(y.Direita)) +1;

        return y;
    }

    
    
    private No<T> rotacaoDuplaDireita(No<T> z) {
        z.Esquerda = rotacaoEsquerda(z.Esquerda);
        return rotacaoDireita(z);
    }

    
    
    private No<T> rotacaoDuplaEsquerda(No<T> z) {
        z.Direita = rotacaoDireita(z.Direita);
        return rotacaoEsquerda(z);
    }

    
    
    private int getBalance(No<T> N) {
        if (N == null)
            return 0;
        return alturaAVL(N.Esquerda) - alturaAVL(N.Direita);
    }
    
    
    
    public void printBalanceamento() {
        printBalanceamentoRec(raiz);
    }

    private void printBalanceamentoRec(No<T> no) {
        if (no != null) {
            System.out.println("Nó: " + no.elemento + ", Balanceamento: " + getBalance(no));
            printBalanceamentoRec(no.Esquerda);
            printBalanceamentoRec(no.Direita);
        }
    }
    
}

