package pw.spn.idealista.exception;

public class InvalidRequestException extends Exception {

    private static final long serialVersionUID = -7964529701362155765L;

    public InvalidRequestException(String message) {
        super(message);
    }
}
