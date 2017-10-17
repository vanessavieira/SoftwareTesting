package br.ufal.ic.myQueue;

import java.util.Vector;

public class Queue<E> implements Fila<E> {

    private int current_size;
    private int head;
    private int tail;
    private int max_size;

    private Vector<E> list;

    public Queue(int size) {
        this.current_size = 0;
        this.head = 0;
        this.tail = -1;
        if (size > 0) {
            this.max_size = size;
        }
        this.list = new Vector<E>(this.max_size);
    }

	public boolean enqueue(E e) {
        if((this.tail-this.head >= this.max_size - 1)){
            return false;

        } else if (e == null) {
            return false;

        } else {
            this.list.add(this.current_size, e);
            this.current_size = this.current_size + 1;
            this.tail = this.tail + 1;
            return true;
        }
	}

	public E dequeue() {
        if(this.head > this.tail){
            return null;
        }else{
            E element = this.list.get(this.head);
            this.head = this.head + 1;
            return element;
        }
	}

	public E element() {
        if(this.head > this.tail){
            return null;

        } else {
            E element = this.list.get(this.head);
            return element;
        }
	}

	public boolean isEmpty() {
        if(this.head > this.tail){
            return true;

        } else {
            return false;
        }
	}

	public void printf() {
		for (E object : list) {
			System.out.println(object);
		}
	}
}