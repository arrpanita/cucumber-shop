package ku.shop;

public class NotEnoughQuantityException extends Exception {
    public NotEnoughQuantityException() {
    }

    public NotEnoughQuantityException(String message) {
        super(message);
    }
}
