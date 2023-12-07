package br.com.ifpe.VectorList;


public class Main {

	public static void main(String[] args) throws MyException{
		VectorList<Integer> list1 = new VectorList<>();
        list1.insert(0, 1);
        list1.insert(1, 2);
        list1.insert(1, 3);

        System.out.println("Lista com vetores: " + list1);

	}

}
