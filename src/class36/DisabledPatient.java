package class36;

public class DisabledPatient extends Patient{
    public void takeTylenol() {
        System.out.println("Your recommended dose is 200mg");
    }
    public double takePayment(double balance, double amountReceived){
        double discount = 0.2;
        //balance after discount
        balance = balance - balance * discount;
        double remainingBalance;
        remainingBalance=balance-amountReceived;

        return remainingBalance;
    }
}
