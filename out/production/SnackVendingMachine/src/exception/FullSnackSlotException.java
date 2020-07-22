package exception;

public class FullSnackSlotException extends RuntimeException {
    private String message;

    public FullSnackSlotException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "exception.FullSnackSlotException\n" +
                "{MESSAGE = " + this.message + "}";
    }
}
