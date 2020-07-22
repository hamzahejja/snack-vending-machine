package exception;

public class EmptySnackSlotException extends RuntimeException {
    private String message;

    public EmptySnackSlotException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "exception.EmptySnackSlotException\n" +
                "{MESSAGE = " + this.message + "}";
    }
}
