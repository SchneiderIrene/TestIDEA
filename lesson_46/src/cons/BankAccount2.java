package cons;

import java.util.List;

public class BankAccount2 {
    private String IBAN;

    public BankAccount2(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        return "BankAccount2{" +
                "IBAN='" + IBAN + '\'' +
                '}';
    }
}
