package QueuePack;

import java.util.ArrayList;

public class MyQueue<T> {

    private ArrayList<T> queue;
    private int first;
    private int last;
    private int currentSize;

    /*
    QueuePack constructor.
    @param Integer which corresponds to the size of the queue.
     */

    public MyQueue(int size) {
        this.queue = new ArrayList<T>();
        this.first = 0;
        this.last = size - 1;
        this.currentSize = 0;
    }

    /*
    Auxiliary method for analysing if the queue is full or not.
     */

    private boolean isFull() {
        if (this.currentSize == this.queue.size())
            return true;
        return false;
    }

    /*
    Inserts an element at the end of the queue.
     */

    public void enqueue(T element) throws Exception {
        checkRep();
        if (this.isFull()) {
            throw new QueueIsFullException("Queue is full.");
        } else {
            this.last = (this.last + 1) % this.queue.size();
            this.queue.add(element);
            this.currentSize++;
        }
        checkRep();
    }

    /*
    Returns the queue size.
     */

    public int size() {
        checkRep();
        return this.currentSize;
    }

    /*
    Returns the first queue element.
     */

    public T element() throws Exception {
        checkRep();
        if (this.currentSize == 0) {
            checkRep();
            throw new QueueIsEmptyException("QueuePack is empty");
        } else {
            final T aux = this.queue.get(first);
            checkRep();
            return aux;
        }
    }

    /*
    Auxiliary method for analysing if the queue is empty of not.
     */

    private boolean isEmpty() {
        if (this.currentSize == 0) {
            return true;
        }
        return false;
    }

    /*
    Removes the queue first element and returns it.
    */

    public T dequeue() throws Exception {
        checkRep();
        if (this.isEmpty()) {
            checkRep();
            throw new QueueIsEmptyException("QueuePack is empty.");
        } else {
            T aux = (T) this.queue.get(first);
            this.queue.add(first,null);
            this.first = (this.first + 1) % this.queue.size();
            this.currentSize--;
            checkRep();
            return aux;
        }

    }

    /*
    Transforms the queue elements in a String.
     */

    @Override
    public String toString() {
        checkRep();
        String ans = "QueuePack = {";

        for (int i = 0; i < this.queue.size(); i++) {
            if (i < this.queue.size() - 1) {
                ans += this.queue.get(i) + ", ";
            } else {
                ans += this.queue.get(i);
            }
        }

        ans += "}";
        checkRep();
        return ans;
    }

    public void resetQueue() throws Exception {
        checkRep();
        for (Object e: queue) {
            this.dequeue();
        }
        checkRep();
    }

    private void checkRep() {
        assert(this.currentSize >= 0 && this.currentSize <= this.queue.size());

        if (this.last < this.first) {
            assert((this.first - this.last) == (this.queue.size()) - this.currentSize);
        }

        if (this.last > this.first) {
            assert((this.last - this.first) == this.currentSize);
        }

        if (this.last == this.first) {
            assert(this.currentSize == 0 || this.currentSize == this.queue.size());
        }
    }
}