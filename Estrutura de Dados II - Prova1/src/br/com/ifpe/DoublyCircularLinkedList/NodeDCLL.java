package br.com.ifpe.DoublyCircularLinkedList;

public class NodeDCLL <T>{
	 T data;
	 NodeDCLL<T> next;
	 NodeDCLL<T> prev;

	 NodeDCLL(T data) {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

}
