package QueuePack;

public class QueueIsFullException extends Exception {

    public QueueIsFullException(String message) {
        super(message);
    }
}