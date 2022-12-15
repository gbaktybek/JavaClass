package class29;

// you can call a Constructor from another constructor only
// you can call a constructor from another constructor, but
// it has to be called in the first line only
class Bank {
    Bank() {
        System.out.println("From Bank");
    }

    Bank(int balance) {
        this(10,20.0);
        System.out.println("From bank "+ balance);
    }

    Bank(int a, double b) {
        this(b, "Hello");
    }

    Bank(double a, String name) {
        this();
    }

}

public class ThisWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println();
        Bank b1 = new Bank(300);
    }
}
