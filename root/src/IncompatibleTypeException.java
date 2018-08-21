public class IncompatibleTypeException extends Exception {

    private String message;

    public IncompatibleTypeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
