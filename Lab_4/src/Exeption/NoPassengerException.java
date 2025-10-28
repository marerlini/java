package Exeption;

public class NoPassengerException extends RuntimeException {
    public NoPassengerException(String message) {
        super(message);
    }
}
