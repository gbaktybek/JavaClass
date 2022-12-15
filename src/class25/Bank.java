package class25;

public class Bank {
    String accName;
    double balance;
    int routingNum;
    char typeOfAcc;
    String currency;

    void deposit(double amount) {
        balance=balance+amount;
    }

    void withdraw(double amount) {
        balance=balance-amount;
    }

    void transferMoney(String accNumber, double amount) {
        System.out.println("Transferring " + amount + " to " + accNumber);
    }
}
