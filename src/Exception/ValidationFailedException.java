package Exception;

public class ValidationFailedException extends RuntimeException{
    public ValidationFailedException(String message){
        super(message);
    }
}
