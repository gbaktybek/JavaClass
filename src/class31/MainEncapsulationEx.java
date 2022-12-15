package class31;
class Bank1{
    private  int balance;
    String accNumber;
    public String accName;
    protected String nomineeDetails;
}

class AmexBank extends Bank1{
    void method() {
        System.out.println(nomineeDetails);
        System.out.println(accName);
        System.out.println(accNumber);
    }
}

public class MainEncapsulationEx {
    public static void main(String[] args) {

    }
}
