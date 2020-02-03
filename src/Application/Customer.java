package Application;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private String[] userIDs = {"foo", "bar", "endGame", "GOT"};
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addAccount(double initialBalance) {
        account = new Account();
        account.setAccountId(Account.getNextId());
        account.deposit(initialBalance);
        customerDetails();
    }
    private void customerDetails() {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}


