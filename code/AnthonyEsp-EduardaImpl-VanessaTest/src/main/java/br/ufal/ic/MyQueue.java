package br.ufal.ic;

import java.util.Vector;

public class MyQueue<T> {

	private int current_size;
	private int head;
	private int tail;
	private int max_size;
	private Vector<T> items;

	public MyQueue(int size) {
		this.current_size = 0;
		this.head = 0;
		this.tail = -1;
		this.max_size = size;
		this.items = new Vector<T>(this.max_size);
	}

	public boolean add(T t){
		//if((this.tail-this.head>=this.max_size-1)||((this.tail == this.head-1)&&this.head!=0)){
		if((this.tail-this.head>=this.max_size-1)){
			return false;
		}
		else{
			/*if(head >= this.max_size){
				this.current_size = 0;
				this.head = 0;
				this.tail = -1;
			}*/
			this.items.add(this.current_size, t);
			this.current_size = this.current_size + 1;
			this.tail = this.tail + 1;
			return true;
		}
	}

	public T remove(){
		if(this.head > this.tail){
			return null;
		}else{
			T element = this.items.get(this.head);
			this.head = this.head + 1;
			return element;
		}
	}

	public boolean isEmpty(){
		if(this.head > this.tail){
			return true;
		}else{
			return false;
		}
	}

	public T first(){
		if(this.head > this.tail){
			return null;
		}else{
			T element = this.items.get(this.head);
			return element;
		}

	}

	public int size(){
			return ((this.tail - this.head) + 1);
	}

}