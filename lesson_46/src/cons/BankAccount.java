package cons;

public class BankAccount {
    private String iBAN;
    private String owner;

    public BankAccount(String iBAN, String owner) {
        this.iBAN = iBAN;
        this.owner = owner;
    }

    public String getiBAN() {
        return iBAN;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iBAN='" + iBAN + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
