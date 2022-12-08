package bank;

import bank.exceptions.AmountNotValidException;

public class OutgoingTransfer extends Transfer{

    OutgoingTransfer(String date, double amount, String description, String sender, String recipient) throws AmountNotValidException {
        super(date, amount, description, sender, recipient);
    };
    @Override
    public double calculate(){
        return (-1 * super.calculate());
    }
}