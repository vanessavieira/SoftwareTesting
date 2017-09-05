package QueuePack;

public interface Queue<T> {

    void enqueue(T element) throws Exception ;

    T dequeue() throws Exception;

    T element() throws Exception;

    int size();

    @Override
    String toString();

    void resetQueue() throws Exception;
}
