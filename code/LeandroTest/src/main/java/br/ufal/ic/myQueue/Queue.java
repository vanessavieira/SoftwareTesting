package br.ufal.ic.myQueue;

public class Queue<E> implements Fila<E> {

    private int current_size;
    private int max_size;
    private E[] myQueue; 
    
    @SuppressWarnings("unchecked")
	public Queue(int size) {
        this.current_size = 0;
        
        if (size > 0) {
            this.max_size = size;
        }
       // this.max_size = 2;
        this.myQueue = (E[])new Object[max_size];
    }

	@SuppressWarnings("unchecked")
	public boolean enqueue(E e) {        
        if (e == null) {
			return false;
		}

		if (current_size >= max_size) {
			return false;

		} else {
			myQueue[current_size] = e;

			this.current_size++;
			return true;
		}
	}

	public E dequeue() {

		if(current_size <= 0) {
			return null;

		} else {
			E element = myQueue[0];

			for(int i = 0; i < current_size - 1; i++) {
				myQueue[i] = myQueue[i+1];
				if(i+1 == current_size - 1) break;
			}

			current_size--;
			return element;
		}
		

	}

	public E element() {
		if (current_size == 0) {
			return null;
		}
		return myQueue[0];
	}

	public boolean isEmpty() {
        if(current_size == 0){
            return true;

        } else {
            return false;
        }
	}

	public void printf() {
		for (int i = 0; i < current_size; i++) {
			System.out.println(myQueue[i]);
		}
	}
}