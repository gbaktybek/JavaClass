package class25;

public class MainClass {
    public static void main(String[] args) {
        // Create & initialize object
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Guldana";

        acc2.accName = "Syrga";
        acc2.balance = 5000;

        acc1.deposit(3000);
        acc2.withdraw(4000);

        System.out.println(acc1.balance);
        System.out.println(acc2.balance);

    }
}
