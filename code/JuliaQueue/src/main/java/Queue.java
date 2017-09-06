public interface Queue<T> {

    boolean push(T element) throws Exception ;

    T remove() throws Exception;

    T pop() throws Exception;

    int size();

}
