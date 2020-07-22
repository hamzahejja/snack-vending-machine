package exception;

public class SnackSoldOutException extends RuntimeException {
    private String message;

    public SnackSoldOutException (String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "exception.SnackSoldOutException{" +
                "message='" + message + '\'' +
                '}';
    }
}
