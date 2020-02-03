package Application;

public class Account {
    private double balance;
    private String accountId;
    private static int NEXTID = 0;
    public static final int ROUTING_NUMBER = 12345;
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void displayAccountDetails() {
        System.out.println("****** Account Information");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Routing Number" + ROUTING_NUMBER);
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public static String getNextId() {
        return "ACCT# " + Account.NEXTID++;
    }
}

