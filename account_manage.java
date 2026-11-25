class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "Raghav", 5000);
        BankAccount account2 = new BankAccount(102, "Rahul", 8000);

        account1.deposit(2000);
        account1.withdraw(1000);

        account2.deposit(3000);
        account2.withdraw(2000);


        System.out.println("\nAccount 1 Details:");
        account1.displayDetails();
        account1.checkBalance();

        System.out.println("\nAccount 2 Details:");
        account2.displayDetails();
        account2.checkBalance();
    }
}
