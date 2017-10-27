package br.ufal.ic.myQueue;

public interface Fila<E> {
	
	boolean enqueue(E e);
	
	E dequeue();
	
	E element();
	
	boolean isEmpty();
	
	void printf();
	
}
