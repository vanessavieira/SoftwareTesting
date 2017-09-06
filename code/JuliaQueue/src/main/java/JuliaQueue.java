public class JuliaQueue<T> implements Queue<T> {

    private Object[] queue;
    private int first;
    private int last;
    private int currentSize;

    /*
    JuliaQueue constructor.
    @param Integer which corresponds to the size of the queue.
     */

    public JuliaQueue(int size) {
        this.queue = new Object[size];
        this.first = 0;
        this.last = 0;
        this.currentSize = 0;
    }

    /*
    Auxiliary method for analysing if the queue is full or not.
     */

    private boolean isFull() {
        if (this.currentSize == this.queue.length)
            return true;
        return false;
    }

    /*
    Inserts an element at the end of the queue.
     */

    public boolean push(T element) throws Exception {
        if (this.isFull()) {
            throw new IndexOutOfBoundsException("Queue is full.");
        } else {
            this.last = (this.last + 1) % this.queue.length;
            this.queue[last] = element;
            this.currentSize++;
            return true;
        }
    }

    /*
    Returns the queue size.
     */

    public int size() {
        return this.currentSize;
    }

    /*
    Returns the first queue element.
     */

    public T pop() throws Exception {
        if (this.currentSize == 0) {
            return null;
        } else {
            final T aux = (T) this.queue[first];
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

    public T remove() throws Exception {
        if (this.isEmpty()) {
            throw new NullPointerException("QueuePack is empty.");
        } else {
            T aux = (T) this.queue[this.first];
            this.queue[this.first] = null;
            this.first = (this.first + 1) % this.queue.length;
            this.currentSize--;
            return aux;
        }

    }


}