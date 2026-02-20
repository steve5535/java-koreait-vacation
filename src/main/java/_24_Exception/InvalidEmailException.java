package _24_Exception;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String msg) {
        super(msg);
    }
}
