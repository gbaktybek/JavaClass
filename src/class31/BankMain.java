package class31;

public class BankMain {
    public static void main(String[] args) {
        ChaseBank gbChase = new ChaseBank();
        BankOfAmerica gbBoFA = new BankOfAmerica();
        WellsFargo gbWF = new WellsFargo();

        gbChase.displayRateOfInterest();
        gbChase.checkBalance();

        gbBoFA.displayRateOfInterest();
        gbBoFA.withdraw(500);

        PayPal pp = new PayPal();
        pp.checkBalance(gbChase);
        pp.checkBalance(gbBoFA);
        pp.checkBalance(gbWF);
    }
}
