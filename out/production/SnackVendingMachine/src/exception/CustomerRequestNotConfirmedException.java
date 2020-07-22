package exception;

public class CustomerRequestNotConfirmedException extends RuntimeException {
    private String message;

    public CustomerRequestNotConfirmedException (String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "exception.CustomerRequestNotConfirmedException{" +
                "message='" + message + '\'' +
                '}';
    }
}
