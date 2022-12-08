package bank;

import bank.exceptions.AmountNotValidException;

public class IncomingTransfer extends Transfer {

    IncomingTransfer(String date, double amount, String description, String sender, String recipient) throws AmountNotValidException {
        super(date, amount, description, sender, recipient);
    };

    @Override
    public double calculate() {
        return super.calculate();
    }

}
