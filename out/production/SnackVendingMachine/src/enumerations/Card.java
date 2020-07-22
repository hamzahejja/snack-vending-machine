package enumerations;

import core.Payable;

import java.math.BigDecimal;

public enum Card implements Payable {
    VISA_CARD("4002123456780000", "VISA_CARD", 1000),
    MASTERCARD("5412751234123456", "MASTERCARD", 1000),
    EMPTY_BALANCE_CARD("4002123456780000", "VISA_CARD", 0);

    private String number;
    private String type;
    private double balance;

    private Card(String number, String type, double balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public BigDecimal getWorth() {
        return BigDecimal.valueOf(0.0);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
